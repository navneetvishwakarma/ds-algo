package com.xask00.study.problems.linkedlist;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) return head;
        ListNode ahead = head;
        int counter = 0;
        while(counter < n) {
            ahead = ahead.next;
            counter++;
        }
        ListNode curr = head;
        ListNode prev = null;

        while (ahead != null) {
            prev = curr;
            curr = curr.next;
            ahead = ahead.next;

        }

        if(prev == null) {
            return curr.next;
        }
        prev.next = curr.next;
        curr.next = null;
        return head;
    }
}
