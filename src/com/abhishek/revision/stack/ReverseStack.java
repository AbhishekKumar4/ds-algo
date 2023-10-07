package com.abhishek.revision.stack;

import java.util.Stack;

public class ReverseStack {

    public void reverse(Stack stack) {
        // base case
        if(stack.isEmpty()) {
            return;
        }

        int element = (int) stack.pop();
        reverse(stack);

        insertAtBottom(stack, element);
    }

    public void insertAtBottom(Stack stack, int element) {
        if(stack.isEmpty()) {
            stack.add(element);
            return;
        }

        int temp = (int) stack.pop();
        insertAtBottom(stack, element);
        stack.add(temp);

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println("Before operation : " +  stack);
        new ReverseStack().reverse(stack);
        System.out.println("After operation : " +  stack);
    }
}
