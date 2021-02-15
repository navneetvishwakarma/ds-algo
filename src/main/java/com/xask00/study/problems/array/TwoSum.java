package com.xask00.study.problems.array;

import java.util.Arrays;

public class TwoSum {

    public boolean isPossible(int[] arr, int sum) {
        if (arr.length < 2) return false;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        return isPossible(arr, sum, 0, arr.length - 1);
    }

    public boolean isPossible(int[] arr, int sum, int left, int right) {
        while(left < right) {
            int currSum = arr[left] + arr[right];
            if (currSum == sum) {
                return true;
            } else if (currSum > sum) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
