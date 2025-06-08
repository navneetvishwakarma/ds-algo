package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeSumTest {

    private ZeroSumTriplets zeroSumTriplets;
    private int[] arr;

    @Before
    public void setup() {
        this.zeroSumTriplets = new ZeroSumTriplets();
    }

    @Test
    public void test1() {
        this.arr = new int[]{3, 8, 5, 1, 9};
    }
}
