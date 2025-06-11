package com.xask00.study.problems.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WarmerDaysTest {
    private WarmerDays warmerDays;

    @Before
    public void setup() {
        this.warmerDays = new WarmerDays();
    }

    @Test
    public void test1() {
        int[] temperatures = new int[]{20, 21, 22, 23, 24, 25};
        int[] result = this.warmerDays.dailyTemperatures(temperatures);
        int[] expectedResult = new int[]{1, 1, 1, 1, 1, 0};
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test2() {
        int[] temperatures = new int[]{25, 24, 23, 22, 21, 20};
        int[] result = this.warmerDays.dailyTemperatures(temperatures);
        int[] expectedResult = new int[]{0, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test3() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = this.warmerDays.dailyTemperatures(temperatures);
        int[] expectedResult = new int[]{1,  1,  4,  2,  1,  1,  0,  0};
        Assert.assertArrayEquals(expectedResult, result);
    }
}
