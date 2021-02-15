package com.xask00.study.problems.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setup() {
        this.fibonacci = new Fibonacci();
    }

    @Test
    public void testBaseCases() {
        Assert.assertEquals("1st Fibonacci number should be 1", 1, fibonacci.get(1));
        Assert.assertEquals("2nd Fibonacci number should be 1", 1, fibonacci.get(2));
    }

    @Test
    public void test2() {
        Assert.assertEquals("3rd Fibonacci number should be 2", 2, fibonacci.get(3));
        Assert.assertEquals("4th Fibonacci number should be 3", 3, fibonacci.get(4));
        Assert.assertEquals("6th Fibonacci number should be 8", 8, fibonacci.get(6));
        Assert.assertEquals("10th Fibonacci number should be 55", 55, fibonacci.get(10));
        Assert.assertEquals("20th Fibonacci number should be 6765", 6765, fibonacci.get(20));
        Assert.assertEquals("50th Fibonacci number should be 12586269025", 12586269025L, fibonacci.get(50));
    }
}
