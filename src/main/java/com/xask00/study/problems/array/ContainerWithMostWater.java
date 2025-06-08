package com.xask00.study.problems.array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;

        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while(start <  end) {
            int currArea = area(height, start, end);
            maxArea = Math.max(maxArea, currArea);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }

    private int area(int[] heights, int start, int end) {
        return Math.min(heights[start], heights[end]) * (end - start);
    }
}
