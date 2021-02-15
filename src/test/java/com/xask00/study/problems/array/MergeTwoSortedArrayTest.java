package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedArrayTest {

    private MergeTwoSortedArray mergeTwoSortedArray;

    @Before
    public void setup() {
        this.mergeTwoSortedArray = new MergeTwoSortedArray();
    }

    @Test
    public void test1() {
        int[] a = {1, 4, 7, 9};
        int[] b = {2, 3, 5};
        int[] expected = {1, 2, 3, 4, 5, 7, 9};
        Assert.assertArrayEquals(expected, this.mergeTwoSortedArray.merge(a, b));
    }

    @Test
    public void test2() {
        int[] a = {1, 2, 4, 7, 9};
        int[] b = {2, 3, 5};
        int[] expected = {1, 2, 2, 3, 4, 5, 7, 9};
        Assert.assertArrayEquals(expected, this.mergeTwoSortedArray.merge(a, b));
    }

}
