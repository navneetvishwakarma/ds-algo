package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

    private TwoSum twoSum;
    private int[] arr;

    @Before
    public void setup() {
        this.twoSum = new TwoSum();
    }

    @Test
    public void test1() {
        this.arr = new int[]{3, 8, 5, 1, 9};
        Assert.assertTrue(this.twoSum.isPossible(arr, 13));
        Assert.assertFalse(this.twoSum.isPossible(arr, 5));
    }
}
