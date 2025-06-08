package com.xask00.study.problems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/description/
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
 * and nums[i] + nums[j] + nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ZeroSumTriplets {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;

        for(int i = 0; i < nums.length - 2; i++) {
            int item = nums[i];
            if (i > 0 && item == nums[i - 1]) {
                continue; // skip duplicates for the first element
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = item + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(item, nums[left], nums[right]);
                    result.add(triplet);
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++; // skip duplicates for left
                    }
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--; // skip duplicates for right
                    }
                    left++;
                    right--;
                } else if (sum < 0){ 
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result;
    }
}
