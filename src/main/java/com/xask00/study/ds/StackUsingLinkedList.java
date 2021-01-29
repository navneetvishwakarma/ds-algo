package com.xask00.study.ds;

public class StackUsingLinkedList implements Stack{

    private class Node {
        int value;
        Node next;
    }

    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    @Override
    public void push(int num) {
        Node node = new Node();
        if (node == null) {
            System.out.println("\nHeap Overflow");
        }
        node.value = num;
        node.next = this.top;
        this.top = node;
    }

    @Override
    public void pop() {
        if (this.isEmpty()) {
            System.out.println("\nStack is empty");
            throw new RuntimeException("Epmty stack.");
        } else {
            this.top = this.top.next;
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
