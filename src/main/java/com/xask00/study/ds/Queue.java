package com.xask00.study.ds;

public interface Queue {
    void enqueue(int num);
    int dequeue();
    int peek();
    int size();
    boolean isEmpty();
}
