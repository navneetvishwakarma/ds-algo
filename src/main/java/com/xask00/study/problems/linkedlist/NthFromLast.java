package com.xask00.study.problems.linkedlist;

import com.xask00.study.ds.Node;

public class NthFromLast {

    public int getNthFromLast(Node head, int n) {
        if (head == null || n == 0) return -1;
        Node fast = head;
        int counter = 0;
        while(counter < n) {
            if (fast == null) {
                return -1;
            }
            fast = fast.getNext();
            counter++;
        }
        Node slow = head;
        while(fast != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow.getValue();
    }

}
