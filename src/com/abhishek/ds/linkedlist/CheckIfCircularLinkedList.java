package com.abhishek.ds;

import com.abhishek.ds.linkedlist.ListNode;

public class CheckIfCircularLinkedList {

    boolean isCircular(ListNode head)
    {
        // Your code here
        ListNode headNode = head;
        while(head.next != null) {
            if(head.next ==headNode) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
