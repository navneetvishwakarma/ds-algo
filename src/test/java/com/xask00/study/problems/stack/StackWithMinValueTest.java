package com.xask00.study.problems.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackWithMinValueTest {

    private StackWithMinValue stackWithMinValue;

    @Before
    public void setup() {
        this.stackWithMinValue = new StackWithMinValue();
    }

    @Test
    public void test1() {
        this.stackWithMinValue.push(10);
        Assert.assertEquals("Min value should be correct", 10, this.stackWithMinValue.getMinValue());
        this.stackWithMinValue.push(8);
        Assert.assertEquals("Min value should be correct", 8, this.stackWithMinValue.getMinValue());
        this.stackWithMinValue.push(12);
        Assert.assertEquals("Min value should be correct", 8, this.stackWithMinValue.getMinValue());
        this.stackWithMinValue.push(4);
        Assert.assertEquals("Min value should be correct", 4, this.stackWithMinValue.getMinValue());
        this.stackWithMinValue.push(30);
        Assert.assertEquals("Min value should be correct", 4, this.stackWithMinValue.getMinValue());
        this.stackWithMinValue.push(4);
        Assert.assertEquals("Min value should be correct", 4, this.stackWithMinValue.getMinValue());
        this.stackWithMinValue.push(0);
        Assert.assertEquals("Min value should be correct", 0, this.stackWithMinValue.getMinValue());
    }

    @Test
    public void test2() {
        this.stackWithMinValue.push(79);
        Assert.assertEquals("Min value should be correct", 79, this.stackWithMinValue.getMinValue());
        this.stackWithMinValue.pop();
        Assert.assertEquals("Min value should be correct", -1, this.stackWithMinValue.getMinValue());
    }
}
