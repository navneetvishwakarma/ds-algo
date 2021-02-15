package com.xask00.study.problems.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GridTravelerTest {

    private GridTraveler gridTraveler;

    @Before
    public void setup() {
        this.gridTraveler = new GridTraveler();
    }

    @Test
    public void testBaseCases() {
        Assert.assertEquals("No of possible paths should be 1", 1, gridTraveler.countAllPath(1, 1));
        Assert.assertEquals("No of possible paths should be 0", 0, gridTraveler.countAllPath(2, 0));
        Assert.assertEquals("No of possible paths should be 0", 0, gridTraveler.countAllPath(0, 7));
    }

    @Test
    public void test2() {
        Assert.assertEquals("No of possible paths should be 1", 1, gridTraveler.countAllPath(1, 5));
        Assert.assertEquals("No of possible paths should be 1", 1, gridTraveler.countAllPath(4, 1));
        Assert.assertEquals("No of possible paths should be 2", 2, gridTraveler.countAllPath(2, 2));
        Assert.assertEquals("No of possible paths should be 3", 3, gridTraveler.countAllPath(2, 3));
        Assert.assertEquals("No of possible paths should be 6", 6, gridTraveler.countAllPath(3, 3));
        Assert.assertEquals("No of possible paths should be 2333606220", 2333606220L, gridTraveler.countAllPath(18, 18));
    }
}
