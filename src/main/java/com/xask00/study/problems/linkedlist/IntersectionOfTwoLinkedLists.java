package com.xask00.study.problems.linkedlist;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        ListNode lng = headA, shrt = headB;
        if (lenB > lenA) {
            lng = headB;
            shrt = headA;
        }
        int diff = Math.abs(lenA - lenB);
        for (int i = 0; i < diff; i++) {
            lng = lng.next;
        }
        while (lng != null) {
            if (lng.equals(shrt)) {
                return lng;
            }
            lng = lng.next;
            shrt = shrt.next;
        }
        return null;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
