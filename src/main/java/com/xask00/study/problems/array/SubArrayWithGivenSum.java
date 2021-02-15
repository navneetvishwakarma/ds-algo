package com.xask00.study.problems.array;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {

    public List<Integer> subArrayWithSum(int[] arr, int n, int sum) {
        List<Integer> indexes = new ArrayList<>();
        if (n == 0) {
            indexes.add(-1);
            return indexes;
        }
        int currSum = 0;
        int start = 0;
        int end = 0;

        while(end < n) {
            currSum += arr[end];
            while (currSum > sum) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == sum) {
                indexes.add(start+1);
                indexes.add(end+1);
                return indexes;
            }
            end++;
        }
        // If no sum found
        indexes.add(-1);
        return indexes;
    }
}
