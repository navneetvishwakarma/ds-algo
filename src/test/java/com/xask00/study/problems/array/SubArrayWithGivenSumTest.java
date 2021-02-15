package com.xask00.study.problems.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class SubArrayWithGivenSumTest {

    private SubArrayWithGivenSum subarrayWithGivenSum;
    private int[] arr;

    @Before
    public void setup() {
        this.subarrayWithGivenSum = new SubArrayWithGivenSum();
    }

    @Test
    public void test1() {
        this.arr = new int[0];
        List<Integer> results = this.subarrayWithGivenSum.subArrayWithSum(arr, arr.length, 10);
        Assert.assertEquals(Optional.of(-1), Optional.of(results.get(0)));
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 7, 5};
        List<Integer> results = this.subarrayWithGivenSum.subArrayWithSum(arr, arr.length, 10);
        Assert.assertEquals(Optional.of(3), Optional.of(results.get(0)));
        Assert.assertEquals(Optional.of(4), Optional.of(results.get(1)));
    }

    @Test
    public void test3() {
        int[] arr = {1, 2, 3, 7, 5};
        List<Integer> results = this.subarrayWithGivenSum.subArrayWithSum(arr, arr.length, 12);
        Assert.assertEquals(Optional.of(2), Optional.of(results.get(0)));
        Assert.assertEquals(Optional.of(4), Optional.of(results.get(1)));
    }

    @Test
    public void test4() {
        int[] arr = {1, 2, 3, 7, 5};
        List<Integer> results = this.subarrayWithGivenSum.subArrayWithSum(arr, arr.length, 16);
        Assert.assertEquals(Optional.of(-1), Optional.of(results.get(0)));
    }

    @Test
    public void test5() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> results = this.subarrayWithGivenSum.subArrayWithSum(arr, arr.length, 15);
        Assert.assertEquals(Optional.of(1), Optional.of(results.get(0)));
        Assert.assertEquals(Optional.of(5), Optional.of(results.get(1)));
    }

    @Test
    public void test6() {
        int[] arr = {1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
        List<Integer> results = this.subarrayWithGivenSum.subArrayWithSum(arr, arr.length, 7);
        Assert.assertEquals(Optional.of(1), Optional.of(results.get(0)));
        Assert.assertEquals(Optional.of(5), Optional.of(results.get(1)));
    }


}
