package com.xask00.study.problems.array;

import com.xask00.study.algos.ArrayBinarySearch;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        RotationPointFinder finder = new RotationPointFinder();
        int rotationPoint = finder.find(nums);
        if (rotationPoint == -1) {
            return ArrayBinarySearch.search(nums, target);
        } else {
            if (target >= nums[rotationPoint] && target <= nums[nums.length-1]) {
                return ArrayBinarySearch.search(nums, rotationPoint, nums.length-1, target);
            }
            return ArrayBinarySearch.search(nums, 0, rotationPoint-1, target);
        }
    }
}
