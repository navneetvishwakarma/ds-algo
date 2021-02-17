package com.xask00.study.problems.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Time Complexity (Brute Force)    : O(n^m * m)
 * Time Complexity (DP)             : O(n * m * m)
 * Space Complexity                 : O(m^2)
 */
public class BestSum {

    public static void main(String[] args) {
        BestSum bestSum = new BestSum();
        int[] arr = {1, 4, 5};
        Map<Integer, List<Integer>> memo = new HashMap<>();
        List<Integer> ans = bestSum.bestSum(arr, 8, memo);
        System.out.println(ans);
    }

    public List<Integer> bestSum(int[] arr, int sum, Map<Integer, List<Integer>> memo) {
        if (arr.length == 0) return null;
        if (sum < 0) return null;
        if (memo.containsKey(sum)) return memo.get(sum);
        List<Integer> result = new ArrayList<>();
        int bestSize = Integer.MAX_VALUE;
        if (sum == 0) return result;
        for (int i = 0; i < arr.length; i++) {
            int remainder = sum - arr[i];
            List<Integer> subSum = bestSum(arr, remainder, memo);
            if (subSum != null) {
                if (subSum.size() + 1 < bestSize) {
                    result.clear();
                    result.addAll(subSum);
                    result.add(arr[i]);
                    bestSize = result.size();
                }
            }
        }
        memo.put(sum, result.size() > 0 ? result : null);
        return memo.get(sum);
    }
}
