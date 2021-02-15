package com.xask00.study.problems.dp;

/**
 * Time Complexity (Normal Recursion)   : O(2^N)
 * Time Complexity (DP):                : O(N)
 * Space Complexity                     : O(N)
 */
public class Fibonacci {

    /**
     * Get nth number in fibonacci sequence
     * @param n
     * @return nth number
     */
    public long get(int n) {
        int size = Math.max(3, n+1);
        long[] memo = new long[size];
        memo[1] = 1;
        memo[2] = 1;
        return get(n, memo);
    }

    private long get(int n, long[] memo) {
        if (memo[n] != 0) return memo[n];
        memo[n] = get(n-1, memo) + get(n-2, memo);
        return memo[n];
    }
}
