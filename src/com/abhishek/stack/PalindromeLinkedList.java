package com.abhishek.stack;

import java.util.Stack;

public class PalindromeLinkedList {

    // no accepted
    public boolean isPalindrome(ListNode head) {
        Stack stack = new Stack();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        while(head.next != null) {
            int val = head.val;
            stringBuilder1.append(val);
            stack.push(val);
        }

        while(!stack.isEmpty()) {
            int value2 = (int) stack.pop();
            stringBuilder2.append(value2);
        }

        if(stringBuilder1.equals(stringBuilder2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
