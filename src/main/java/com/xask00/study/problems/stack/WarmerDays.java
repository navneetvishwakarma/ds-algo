package com.xask00.study.problems.stack;

import java.util.ArrayDeque;

/**
 * https://leetcode.com/problems/daily-temperatures/description/
 */
public class WarmerDays {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> unresolved = new ArrayDeque<Integer>();
        int[] result = new int[temperatures.length];

        for(int curr = 0; curr < temperatures.length; curr++) {
            while(!unresolved.isEmpty() && (temperatures[curr] > temperatures[unresolved.peek()])) {
                int prev = unresolved.poll();
                result[prev] = curr - prev;
            }
            unresolved.push(curr);
        }

        return result; 
    }
}
