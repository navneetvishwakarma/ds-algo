package com.xask00.study.problems.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CanSumTest {

    private CanSum canSum;
    private int[] arr;

    @Before
    public void setup() {
        this.canSum = new CanSum();
    }

    @Test
    public void baseCaseTest() {
        this.arr = new int[0];
        Assert.assertFalse("Should return false", this.canSum.canSum(this.arr, 5));
        this.arr = new int[]{1, 2, 3};
        Assert.assertTrue("Should return true", this.canSum.canSum(this.arr, 0));
    }

    @Test
    public void test1() {
        this.arr = new int[]{8, 4, 3, 5};
        Assert.assertFalse("Should return false", this.canSum.canSum(this.arr, 2));
        this.arr = new int[]{1, 2, 3};
        Assert.assertTrue("Should return true", this.canSum.canSum(this.arr, 9));
    }

    @Test
    public void bigTest() {
        this.arr = new int[]{7, 14};
        Assert.assertFalse("Should return false", this.canSum.canSum(this.arr, 300));
    }
}
