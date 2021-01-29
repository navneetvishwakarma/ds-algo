package com.xask00.study.problems.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NextLargestElementTest {
    private NextLargestElement nextLargestElement;

    @Before
    public void setup() {
        this.nextLargestElement = new NextLargestElement();
    }

    @Test
    public void test1() {
        long[] arr = {1, 3, 2, 4};
        long[] result = {3, 4, 4, -1};
        Assert.assertArrayEquals("Output mismatched", result, nextLargestElement.nextLargestElements(arr, 4));
    }

    @Test
    public void test2() {
        long[] arr = {6, 8, 0, 1, 3};
        long[] result = {8, -1, 1, 3, -1};
        Assert.assertArrayEquals("Output mismatched", result, nextLargestElement.nextLargestElements(arr, 5));
    }

    @Test
    public void test3() {
        long[] arr = {4, 3, 2, 1};
        long[] result = {-1, -1, -1, -1};
        Assert.assertArrayEquals("Output mismatched", result, nextLargestElement.nextLargestElements(arr, 4));
    }

    @Test
    public void test4() {
        long[] arr = {1, 5, 14, 12, 6, 78, 9, 4, 55, 59};
        long[] result = {5, 14, 78, 78, 78, -1, 55, 55, 59, -1};
        Assert.assertArrayEquals("Output mismatched", result, nextLargestElement.nextLargestElements(arr, 10));
    }

    @Test
    public void test5() {
        long[] arr = {10, 3, 12, 4, 2, 9, 13, 0, 8, 11, 1, 7, 5, 6};
        long[] result = {12, 12, 13, 9, 9, 13, -1, 8, 11, -1, 7, -1, 6, -1};
        Assert.assertArrayEquals("Output mismatched", result, nextLargestElement.nextLargestElements(arr, 14));
    }
}
