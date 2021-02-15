package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeSumTest {

    private ThreeSum threeSum;
    private int[] arr;

    @Before
    public void setup() {
        this.threeSum = new ThreeSum();
    }

    @Test
    public void test1() {
        this.arr = new int[]{3, 8, 5, 1, 9};
        Assert.assertTrue(this.threeSum.isPossible(arr, 15));
        Assert.assertFalse(this.threeSum.isPossible(arr, 513));
    }
}
