package com.abhishek.ds.linkedlist;

public class RemoveDuplicatesFromSortedList {

    public LinkedListCycle.ListNode deleteDuplicates(LinkedListCycle.ListNode head) {
        LinkedListCycle.ListNode currentNode =  head;

        while(currentNode != null && currentNode.next != null) {
            if(currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
