package com.abhishek.revision.stack;

import java.util.Stack;

public class InsertAtBottom {

    public void insertAtBottom(Stack stack, int input) {
        // base case
        if(stack.isEmpty()) {
            stack.add(input);
            return;
        }

        int value = (int)stack.pop();
        // recursive call
        insertAtBottom(stack, input);
        // refill
        stack.add(value);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println("Before operation : " +  stack);
        new InsertAtBottom().insertAtBottom(stack, 1);
        System.out.println("After operation : " +  stack);
    }
}
