package com.xask00.study.problems.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RottenOrangesTest {
    private RottenOranges rottenOranges;

    @Before
    public void setup() {
        this.rottenOranges = new RottenOranges();
    }

    @Test
    public void test1() {
        int grid[][] = {
                {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
        Assert.assertEquals("Time taken should be 1", 2, this.rottenOranges.timeToRot(grid));
    }

    @Test
    public void test2() {
        int grid[][] = {
                {2, 1, 0, 2, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 2, 1}};
        Assert.assertEquals("Time taken should be 1", -1, this.rottenOranges.timeToRot(grid));
    }

    @Test
    public void test3() {
        int grid[][] = {
                {2, 1, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 1, 1}};
        Assert.assertEquals("Time taken should be 1", 7, this.rottenOranges.timeToRot(grid));
    }
}
