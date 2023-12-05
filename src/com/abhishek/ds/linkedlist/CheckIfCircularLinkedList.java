package com.abhishek.ds;

public class CheckIfCircularLinkedList {

    boolean isCircular(Node head)
    {
        // Your code here
        Node headNode = head;
        while(head.next != null) {
            if(head.next ==headNode) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
