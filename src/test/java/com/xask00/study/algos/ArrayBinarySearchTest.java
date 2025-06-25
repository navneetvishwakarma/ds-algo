package com.xask00.study.algos;

import org.junit.Assert;
import org.junit.Test;

public class ArrayBinarySearchTest {

    @Test
    public void testElementPresentInMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        int index = ArrayBinarySearch.search(arr, 5);
        Assert.assertEquals(2, index);
    }

    @Test
    public void testElementPresentAtBeginning() {
        int[] arr = {2, 4, 6, 8};
        int index = ArrayBinarySearch.search(arr, 2);
        Assert.assertEquals(0, index);
    }

    @Test
    public void testElementPresentAtEnd() {
        int[] arr = {10, 20, 30, 40};
        int index = ArrayBinarySearch.search(arr, 40);
        Assert.assertEquals(3, index);
    }

    @Test
    public void testElementNotPresent() {
        int[] arr = {1, 2, 3, 4, 5};
        int index = ArrayBinarySearch.search(arr, 6);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int index = ArrayBinarySearch.search(arr, 1);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testNullArray() {
        int index = ArrayBinarySearch.search(null, 1);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testSingleElementPresent() {
        int[] arr = {42};
        int index = ArrayBinarySearch.search(arr, 42);
        Assert.assertEquals(0, index);
    }

    @Test
    public void testSingleElementNotPresent() {
        int[] arr = {42};
        int index = ArrayBinarySearch.search(arr, 24);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-10, -5, 0, 5, 10};
        int index = ArrayBinarySearch.search(arr, -5);
        Assert.assertEquals(1, index);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {1, 2, 2, 2, 3};
        int index = ArrayBinarySearch.search(arr, 2);
        // Could be 1, 2, or 3; binary search may return any of them
        Assert.assertTrue(index == 1 || index == 2 || index == 3);
    }
}