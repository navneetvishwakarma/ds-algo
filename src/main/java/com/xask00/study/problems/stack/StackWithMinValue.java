package com.xask00.study.problems.stack;

import java.util.Stack;

/**
 * Stack implementation with getMin(), push() and pop() in O(1)
 */
public class StackWithMinValue {
    private Stack<Integer> stack;
    private int minValue;

    public StackWithMinValue() {
        this.stack = new Stack<>();
        this.minValue = -1;
    }

    public void push(int num) {
        if (stack.isEmpty()) {
            minValue = num;
            stack.push(num);
        } else if (num < this.minValue) {
            stack.push(num * 2 - minValue);
            minValue = num;
        } else {
            stack.push(num);
        }
    }

    public int peek() {
        if (stack.isEmpty()) return -1;
        return (stack.peek() < this.minValue) ? this.minValue : stack.peek();
    }

    public int pop() {
        if (stack.isEmpty()) return -1;
        int popped = stack.pop();
        if (popped < this.minValue) {
            this.minValue = 2*minValue - popped;
        }
        return popped;
    }

    public int getMinValue() {
        return stack.isEmpty() ? -1 : this.minValue;
    }
}
