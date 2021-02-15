package com.xask00.study.problems.array;

import java.sql.Array;
import java.util.Arrays;

public class ThreeSum {

    private TwoSum twoSum;

    public ThreeSum() {
        this.twoSum = new TwoSum();
    }

    public boolean isPossible(int[] arr, int sum) {
        if (arr.length < 3 || sum == 0) return false;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int remainder = sum - arr[i];
            if (this.twoSum.isPossible(arr, remainder, i + 1, arr.length - 1)) {
                return true;
            }
        }
        return false;
    }

}
