package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainerWithMostWaterTest {
    ContainerWithMostWater containerWithMostWater;

    @Before
    public void setup() {
        this.containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void test1() {
        int[] heights = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int area = this.containerWithMostWater.maxArea(heights);

        Assert.assertEquals(area, 49);
    }

    @Test
    public void test2() {
        int[] heights = new int[] {1, 8, 1};
        int area = this.containerWithMostWater.maxArea(heights);

        Assert.assertEquals(area, 2);
    }

    @Test
    public void test3() {
        int[] heights = new int[] {1, 2, 4, 3};
        int area = this.containerWithMostWater.maxArea(heights);

        Assert.assertEquals(area, 4);
    }
}
