package com.abhishek.ds.linkedlist;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        // Handle the case where the head itself needs to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode currentNode = head;

        while(currentNode != null && currentNode.next != null) {
            if(currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
