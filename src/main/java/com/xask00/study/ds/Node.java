package com.xask00.study.ds;

public class Node {
    private int value;
    private Node next;

    public Node(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
