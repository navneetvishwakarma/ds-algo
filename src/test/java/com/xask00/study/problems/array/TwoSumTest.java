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
        this.arr = new int[]{2, 7, 11, 15};
        int[] result = this.twoSum.twoSum(arr, 9);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }

    @Test
    public void test2() {
        this.arr = new int[]{3, 2, 4};
        int[] result = this.twoSum.twoSum(arr, 6);
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
    }

    @Test
    public void test3() {
        this.arr = new int[]{3, 3};
        int[] result = this.twoSum.twoSum(arr, 6);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }
}
