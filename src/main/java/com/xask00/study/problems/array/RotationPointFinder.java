package com.xask00.study.problems.array;

public class RotationPointFinder {
    public int find(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int start = 0, len = nums.length, end = len - 1;
        if (nums[start] <= nums[end]) {
            return -1;
        }
        while (start < end) {
            if (nums[start] < nums[end]) {
                return start;
            }
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return start;
    }
}
