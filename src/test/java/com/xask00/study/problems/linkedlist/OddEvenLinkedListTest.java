package com.xask00.study.problems.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddEvenLinkedListTest {
    OddEvenLinkedList oddEvenLinkedList;

    @Before
    public void setup() {
        this.oddEvenLinkedList = new OddEvenLinkedList();
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = this.oddEvenLinkedList.oddEvenList(head);
        System.out.println("result:"+head.toString());
        Assert.assertEquals("13524", result.toString());
    }
    
    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = this.oddEvenLinkedList.oddEvenList(head);
        System.out.println("result:"+head.toString());
        Assert.assertEquals("135246", result.toString());
    }
}
