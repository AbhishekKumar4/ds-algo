package com.abhishek.revision.stack;

import java.util.Stack;

public class DeleteFromMiddle {

    public void popMiddle(int index, int size, Stack stack) {
        // base case
        if(index == size/2) {
            stack.pop();
            return;
        }

        // keep popping until you reach middle of stack
        int element = (int) stack.pop();
        popMiddle(index + 1, size, stack);
        // element deleted, now push back the popped items
        stack.add(element);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println("Before operation : " +  stack);
        new DeleteFromMiddle().popMiddle(0, stack.size(), stack);
        System.out.println("After operation : " +  stack);
    }
}
