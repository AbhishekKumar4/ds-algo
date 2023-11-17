package com.abhishek.ds.linkedlist;
public class ReverseLinkedList {
    public LinkedListCycle.ListNode reverseList(LinkedListCycle.ListNode head) {
        LinkedListCycle.ListNode currentNode = head;
        LinkedListCycle.ListNode previousNode = null;
        LinkedListCycle.ListNode nextNode = null;

        while(currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

}
