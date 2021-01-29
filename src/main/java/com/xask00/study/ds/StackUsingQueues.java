package com.xask00.study.ds;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues implements Stack{

    private Queue<Integer> primaryQueue;
    private Queue<Integer> secondaryQueue;

    public StackUsingQueues() {
        this.primaryQueue = new LinkedList<>();
        this.secondaryQueue = new LinkedList<>();
    }

    @Override
    public void push(int num) {
        this.secondaryQueue.add(num);
        while(!this.primaryQueue.isEmpty()) {
            this.secondaryQueue.add(this.primaryQueue.remove());
        }
        Queue<Integer> temp = this.primaryQueue;
        this.primaryQueue = this.secondaryQueue;
        this.secondaryQueue = temp;
    }

    @Override
    public void pop() {
        if(this.primaryQueue.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        } else {
            this.primaryQueue.remove();
        }
    }

    @Override
    public int peek() {
        if (this.primaryQueue.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return this.primaryQueue.peek();
        }
    }

    @Override
    public int size() {
        return this.primaryQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return this.primaryQueue.isEmpty();
    }

    @Override
    public void display() {
        if (this.primaryQueue.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println();
            for (Integer value : this.primaryQueue) {
                System.out.print(value + " ");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(!this.primaryQueue.isEmpty()) {
            for (Integer value : this.primaryQueue) {
                sb.append(value);
                sb.append(" ");
            }
            sb.delete(sb.length()-1, sb.length());
        }
        return sb.toString();
    }
}
