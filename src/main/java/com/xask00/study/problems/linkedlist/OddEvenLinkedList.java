package com.xask00.study.problems.linkedlist;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode odd = head;
        ListNode even = head.next;
        int index = 1;
        while(curr.next != null) {
            ListNode next = curr.next;
            curr.next = next.next;
            curr = next;
            index++;
            if (index % 2 == 1) {
                odd = curr;
            }
        }

        odd.next = even;
        return head;
    }
}
