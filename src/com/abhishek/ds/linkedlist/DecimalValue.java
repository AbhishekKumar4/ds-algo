package com.abhishek.ds.linkedlist;

public class DecimalValue {
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;

        while(head != null) {
            decimalValue = decimalValue * 2 + head.val;
            head = head.next;
        }
        return decimalValue;
    }
}
