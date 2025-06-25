package com.xask00.study;

import com.xask00.study.problems.linkedlist.ListNode;
import com.xask00.study.problems.linkedlist.OddEvenLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to DS and Algorithm implementation!" );
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println("head:"+head.toString());
        ListNode result = new OddEvenLinkedList().oddEvenList(head);
        System.out.println("result:"+result.toString());
    }
}
