package com.abhishek.ds.linkedlist;

public class MiddleOfTheLinkedList {

    public LinkedListCycle.ListNode middleNode(LinkedListCycle.ListNode head) {
        LinkedListCycle.ListNode slowPointer = head;
        LinkedListCycle.ListNode fastPointer =  head;

        while(fastPointer != null && fastPointer.next != null) {
            fastPointer =  fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }
}
