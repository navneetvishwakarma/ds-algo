package com.xask00.study.problems.dp;

import java.util.HashMap;
import java.util.Map;

public class CanSum {

    public boolean canSum(int[] arr, int sum) {
        Map<Integer, Boolean> memo = new HashMap<>();
        long start = System.currentTimeMillis();
        boolean answer = canSum(arr, sum, memo);
        System.out.println("Time Taken: " + (System.currentTimeMillis() - start));
        return answer;
    }

    public boolean canSum(int[] arr, int sum, Map<Integer, Boolean> memo) {
        if (sum == 0) return true;
        if (sum < 0) return false;
        if (memo.containsKey(sum)) return memo.get(sum);
        for (int i = 0; i < arr.length; i++) {
            if (canSum(arr, sum-arr[i], memo)) {
                memo.put(sum, true);
                return true;
            }
        }
        memo.put(sum, false);
        return false;
    }
}
