package com.xask00.study.ds;

public class StackUsingLinkedList implements Stack{

    private class Node {
        int value;
        Node next;
    }

    private Node top;
    private int size = 0;

    public StackUsingLinkedList() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push(int num) {
        Node node = new Node();
        if (node == null) {
            System.out.println("\nHeap Overflow");
            throw new RuntimeException("Heap Overflow");
        }
        node.value = num;
        node.next = this.top;
        this.top = node;
        this.size++;
    }

    @Override
    public void pop() {
        if (this.isEmpty()) {
            System.out.println("\nStack is empty");
            throw new RuntimeException("Empty stack.");
        } else {
            this.top = this.top.next;
            this.size--;
        }
    }

    @Override
    public int peek() {
        if (this.isEmpty()) {
            System.out.println("\nStack is empty!");
            return -1;
        } else {
            return this.top.value;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return (this.top == null);
    }

    @Override
    public void display() {
        if (this.isEmpty()) {
            System.out.println("\nStack is empty!");
        } else {
            Node currNode = this.top;
            System.out.println();
            while(currNode != null) {
                System.out.print(currNode.value + " ");
                currNode = currNode.next;
            }
        }
    }
}
