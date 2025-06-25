package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotationPointFinderTest {

    private RotationPointFinder finder;

    @Before
    public void setUp() {
        finder = new RotationPointFinder();
    }

    @Test
    public void testNoRotation() {
        int[] nums = {1, 2, 3, 4, 5};
        // No rotation, should return -1 (not found)
        Assert.assertEquals(-1, finder.find(nums));
    }

    @Test
    public void testRotationAtIndex2() {
        int[] nums = {4, 5, 1, 2, 3};
        // Rotation at index 2 (1 is the smallest)
        Assert.assertEquals(2, finder.find(nums));
    }

    @Test
    public void testRotationAtIndex0() {
        int[] nums = {5, 1, 2, 3, 4};
        // Rotation at index 1 (1 is the smallest)
        Assert.assertEquals(1, finder.find(nums));
    }

    @Test
    public void testRotationAtLastIndex() {
        int[] nums = {2, 3, 4, 5, 1};
        // Rotation at index 4 (1 is the smallest)
        Assert.assertEquals(4, finder.find(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {10};
        // Only one element, no rotation
        Assert.assertEquals(-1, finder.find(nums));
    }

    @Test
    public void testTwoElementsRotated() {
        int[] nums = {2, 1};
        // Rotation at index 1 (1 is the smallest)
        Assert.assertEquals(1, finder.find(nums));
    }

    @Test
    public void testTwoElementsNotRotated() {
        int[] nums = {1, 2};
        // No rotation
        Assert.assertEquals(-1, finder.find(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        // Empty array, should return -1
        Assert.assertEquals(-1, finder.find(nums));
    }

    @Test
    public void testAllSameElements() {
        int[] nums = {7, 7, 7, 7};
        // All elements same, no rotation
        Assert.assertEquals(-1, finder.find(nums));
    }
}