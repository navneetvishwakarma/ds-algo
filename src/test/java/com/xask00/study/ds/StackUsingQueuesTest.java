package com.xask00.study.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackUsingQueuesTest {
    private StackUsingQueues stack;

    @Before
    public void initiate() {
        stack = new StackUsingQueues();
    }

    @Test
    public void sampleTest() {
        String s = "Test";
        Assert.assertEquals("Sample test should pass.","Test", s);
    }

    @Test
    public void StackPushAndPeekTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals("Top element should be 3", 3, stack.peek());
    }

    @Test
    public void StackPopTest() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        Assert.assertEquals("Top element should be 1", 1, stack.peek());
        stack.pop();
        Assert.assertTrue("Stack must be empty", stack.isEmpty());
    }

    @Test
    public void StackSizeTest() {
        stack.push(1);
        stack.push(2);
        Assert.assertEquals("Stack size should be 2", 2, stack.size());
        stack.pop();
        Assert.assertEquals("Stack size should be 1", 1, stack.size());
        stack.pop();
        Assert.assertEquals("Stack size should be 0", 0, stack.size());
    }

    @Test(expected = RuntimeException.class)
    public void StackPopExceptionTest() {
        stack.pop();
    }

    @Test
    public void StackStringTest() {
        stack.push(1);
        stack.push(2);
        Assert.assertEquals("ToString should be correct", "2 1", stack.toString());
    }
}
