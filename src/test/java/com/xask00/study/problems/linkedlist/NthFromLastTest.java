package com.xask00.study.problems.linkedlist;

import com.xask00.study.ds.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NthFromLastTest {
    private NthFromLast nthFromLast;
    private Node head;

    @Before
    public void setup() {
        this.nthFromLast = new NthFromLast();
        this.head = new Node(1);
        this.head.setNext(new Node(2));
        this.head.getNext().setNext(new Node(3));
        this.head.getNext().getNext().setNext(new Node(4));
        this.head.getNext().getNext().getNext().setNext(new Node(5));
    }

    @Test
    public void test1() {
        Assert.assertEquals("Should return -1", -1, this.nthFromLast.getNthFromLast(null, 2));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Should return 1", 1, this.nthFromLast.getNthFromLast(head, 5));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Should return 1", -1, this.nthFromLast.getNthFromLast(head, 0));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Should return -1", -1, this.nthFromLast.getNthFromLast(head, 6));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Should return -1", 4, this.nthFromLast.getNthFromLast(head, 2));
    }
}
