package com.xask00.study.problems.stack;

import java.util.Stack;

public class NextLargestElement {
    public long[] nextLargestElements(long[] arr, int n) {
        Stack<Long> s = new Stack<>();
        long[] results = new long[n];

        for(int i = n-1; i>= 0; i--) {
            while(!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            results[i] = s.isEmpty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        return results;
    }
}
