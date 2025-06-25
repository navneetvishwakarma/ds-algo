package com.xask00.study.problems.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {
    private IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists;

    @Before
    public void setup() {
        this.intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    }

    @Test
    public void test1() {
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode b = new ListNode(7, a.next.next.next.next);

        ListNode is = this.intersectionOfTwoLinkedLists.getIntersectionNode(a, b);
        Assert.assertEquals(5, is.val);
    }
}
