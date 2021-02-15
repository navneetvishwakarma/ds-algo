package com.xask00.study.problems.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * n: length of array
 * m: target sum
 * Time Complexity (Recursive)  : O(n^m)
 * Space Complexity             : O(n)
 */
public class HasSum {

    public static void main(String[] args) {
        HasSum hasSum = new HasSum();
        int[] arr = {14, 7};
        int sum = 600;
        Map<Integer, List<Integer>> memo = new HashMap<>();
        System.out.println(hasSum.hasSum(arr, sum, memo));
    }

    public List<Integer> hasSum(int[] arr, int sum, Map<Integer, List<Integer>> memo) {
        List<Integer> result = new ArrayList<>();
        if (arr.length == 0) return null;
        if (sum < 0) return null;
        if (sum == 0) return result;
        if (memo.containsKey(sum)) {
            return memo.get(sum);
        }
        for (int i = 0; i < arr.length; i++) {
            result =  hasSum(arr, sum-arr[i], memo);
            if (result != null) {
                result.add(arr[i]);
                memo.put(sum, result);
                break;
            }
        }
        memo.put(sum, null);
        return memo.get(sum);
    }
}
