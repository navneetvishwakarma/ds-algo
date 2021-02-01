package com.xask00.study;

import com.xask00.study.ds.DLLNode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private DLLNode start;
    private DLLNode end;
    private int size;
    private int capacity;
    private Map<Integer, DLLNode> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.start = null;
        this.end = null;
        this.map = new HashMap<>();
    }

    public void put(int key, int value) {
        // If the entry is already there, update it and make it recently used
        DLLNode newEntry = new DLLNode(key, value);

        if (this.map.containsKey(key)) {
            DLLNode existingEntry = this.map.get(key);
            this.removeNode(existingEntry);
        } else {
            if (this.size == this.capacity) {
                this.map.remove(this.end.getKey());
                this.removeNode(this.end);
                this.size--;
            }
            this.size++;
        }
        this.addAtTop(newEntry);
        this.map.put(key, newEntry);
    }

    public int get(int key) {
        if (this.map.containsKey(key)) {
            DLLNode existingEntry = this.map.get(key);
            int value = existingEntry.getValue();
            this.removeNode(existingEntry);
            this.addAtTop(existingEntry);
            return value;
        }
        return -1;
    }

    private void addAtTop(DLLNode node) {
        node.setRight(this.start);
        if (this.start != null) {
            this.start.setLeft(node);
        }
        this.start = node;
        if (this.end == null) {
            this.end = node;
        }
    }

    private void removeNode(DLLNode node) {
        if (node.getLeft() != null) {
            node.getLeft().setRight(node.getRight());
        } else {
            this.start = node.getRight();
        }
        if (node.getRight() != null) {
            node.getRight().setLeft(node.getLeft());
        } {
            this.end = node.getLeft();
        }
        node.setLeft(null);
        node.setRight(null);
    }

    public void printCache() {
        DLLNode node = this.start;
        while (node != null) {
            System.out.print(node.print() + " ");
            node = node.getRight();
        }
        System.out.println(" Size: " + this.size);
    }
}
