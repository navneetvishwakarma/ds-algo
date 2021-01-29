package com.xask00.study.ds;

import java.util.Stack;

public class QueueUsingStacks implements Queue {
    private Stack<Integer> primaryStack;
    private Stack<Integer> secondaryStack;

    public QueueUsingStacks() {
        this.primaryStack = new Stack<>();
        this.secondaryStack = new Stack<>();
    }

    @Override
    public void enqueue(int num) {
        while(!this.primaryStack.isEmpty()) {
            this.secondaryStack.push(this.primaryStack.pop());
        }
        this.primaryStack.push(num);
        while(!this.secondaryStack.isEmpty()) {
            this.primaryStack.push(this.secondaryStack.pop());
        }
    }

    @Override
    public int dequeue() {
        if (this.primaryStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return this.primaryStack.pop();
    }

    @Override
    public int peek() {
        if (this.primaryStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return this.primaryStack.peek();
    }

    @Override
    public int size() {
        return this.primaryStack.size();
    }

    @Override
    public boolean isEmpty() {
        return this.primaryStack.isEmpty();
    }
}
