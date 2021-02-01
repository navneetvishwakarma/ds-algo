package com.xask00.study.ds;

public class DLLNode {
    int key;
    int value;
    DLLNode left;
    DLLNode right;

    public DLLNode(int key, int val) {
        this.key = key;
        this.value = val;
        this.left = null;
        this.right = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DLLNode getLeft() {
        return left;
    }

    public void setLeft(DLLNode left) {
        this.left = left;
    }

    public DLLNode getRight() {
        return right;
    }

    public void setRight(DLLNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "DLLNode{" +
                "key=" + key +
                ", value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public String print() {
        return "(" + key + ", " + value + ")";
    }
}
