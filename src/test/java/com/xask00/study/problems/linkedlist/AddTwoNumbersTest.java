package com.xask00.study.problems.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @Before
    public void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    private ListNode buildList(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(expected);
        Assert.assertNull(actual);
    }

    @Test
    public void testBothNull() {
        ListNode result = addTwoNumbers.addTwoNumbers(null, null);
        Assert.assertNull(result);
    }

    @Test
    public void testFirstNull() {
        ListNode l2 = buildList(1, 2, 3);
        ListNode result = addTwoNumbers.addTwoNumbers(null, l2);
        assertListEquals(l2, result);
    }

    @Test
    public void testSecondNull() {
        ListNode l1 = buildList(4, 5, 6);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, null);
        assertListEquals(l1, result);
    }

    @Test
    public void testEqualLengthNoCarry() {
        ListNode l1 = buildList(2, 4, 3);
        ListNode l2 = buildList(5, 1, 2);
        ListNode expected = buildList(7, 5, 5);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertListEquals(expected, result);
    }

    @Test
    public void testEqualLengthWithCarry() {
        ListNode l1 = buildList(7, 8, 9);
        ListNode l2 = buildList(5, 6, 4);
        ListNode expected = buildList(1, 3, 5, 3);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertListEquals(expected, result);
    }

    @Test
    public void testEqualLengthWithCarry2() {
        ListNode l1 = buildList(2, 4, 3);
        ListNode l2 = buildList(5, 6, 4);
        ListNode expected = buildList(7, 0, 8);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertListEquals(expected, result);
    }

    @Test
    public void testDifferentLength() {
        ListNode l1 = buildList(1, 2);
        ListNode l2 = buildList(9, 9, 9);
        ListNode expected = buildList(1, 0, 1, 1);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertListEquals(expected, result);
    }

    @Test
    public void testFinalCarry() {
        ListNode l1 = buildList(9, 9, 9);
        ListNode l2 = buildList(1);
        ListNode expected = buildList(1, 0, 0, 0);
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertListEquals(expected, result);
    }
}