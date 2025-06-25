package com.xask00.study.problems.array;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

    private SearchInRotatedSortedArray searcher;

    @Before
    public void setUp() {
        searcher = new SearchInRotatedSortedArray();
    }

    @Test
    public void testNoRotationTargetPresent() {
        int[] nums = {1, 2, 3, 4, 5};
        Assert.assertEquals(2, searcher.search(nums, 3));
    }

    @Test
    public void testNoRotationTargetAbsent() {
        int[] nums = {1, 2, 3, 4, 5};
        Assert.assertEquals(-1, searcher.search(nums, 6));
    }

    @Test
    public void testRotationAtIndex2TargetPresent() {
        int[] nums = {4, 5, 1, 2, 3};
        Assert.assertEquals(3, searcher.search(nums, 2));
    }

    @Test
    public void testRotationAtIndex4TargetPresent() {
        int[] nums = {4,5,6,7,0,1,2};
        Assert.assertEquals(4, searcher.search(nums, 0));
    }

    @Test
    public void testRotationAtIndex2TargetAbsent() {
        int[] nums = {4, 5, 1, 2, 3};
        Assert.assertEquals(-1, searcher.search(nums, 6));
    }

    @Test
    public void testRotationAtLastIndexTargetPresent() {
        int[] nums = {2, 3, 4, 5, 1};
        Assert.assertEquals(4, searcher.search(nums, 1));
    }

    @Test
    public void testSingleElementPresent() {
        int[] nums = {10};
        Assert.assertEquals(0, searcher.search(nums, 10));
    }

    @Test
    public void testSingleElementAbsent() {
        int[] nums = {10};
        Assert.assertEquals(-1, searcher.search(nums, 5));
    }

    @Test
    public void testTwoElementsRotatedPresent() {
        int[] nums = {2, 1};
        Assert.assertEquals(1, searcher.search(nums, 1));
    }

    @Test
    public void testTwoElementsRotatedAbsent() {
        int[] nums = {2, 1};
        Assert.assertEquals(-1, searcher.search(nums, 3));
    }

    @Test
    public void testTwoElementsNotRotatedPresent() {
        int[] nums = {1, 2};
        Assert.assertEquals(1, searcher.search(nums, 2));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        Assert.assertEquals(-1, searcher.search(nums, 1));
    }

    @Test
    public void testAllSameElements() {
        int[] nums = {7, 7, 7, 7};
        Assert.assertEquals(0, searcher.search(nums, 7));
        Assert.assertEquals(-1, searcher.search(nums, 8));
    }
}