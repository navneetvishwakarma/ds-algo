package com.xask00.study.problems.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode l1r = reverseLinkedList.reverseList(l1);
        ListNode l2r = reverseLinkedList.reverseList(l2);

        ListNode sumr = null;
        ListNode result = null;
        int carry = 0;
        while (l1r != null && l2r != null) {
            int sum = l1r.val + l2r.val + carry;
            ListNode node = new ListNode(sum%10);
            if (sumr == null) { 
                sumr = node;
                result = node;
            } else {
                sumr.next = node;
                sumr = sumr.next;
            }
            carry = sum/10;

            l1r = l1r.next;
            l2r = l2r.next;
        }
        ListNode rem = (l1r != null) ? l1r : l2r;

        while(rem != null) {
            int sum = rem.val + carry;
            ListNode node = new ListNode(sum%10);
            sumr.next = node;
            sumr = sumr.next;
            carry = sum/10;;
            rem = rem.next;
        }

        if (carry > 0) {
            sumr.next = new ListNode(carry);
        }

        return reverseLinkedList.reverseList(result);
    }
}
