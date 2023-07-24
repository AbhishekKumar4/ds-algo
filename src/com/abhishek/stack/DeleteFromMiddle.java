package com.abhishek.stack;

import java.util.Stack;

public class DeleteFromMiddle {

    public void popMiddle(Stack input, int index, int size) {
        // base case
        if(index == size/2) {
            input.pop();
            return;
        }

        // keep popping until you reach middle element
        int element = (int) input.pop();

        // recursive call
        popMiddle(input, index + 1, size);

        // put the popped values back
        input.add(element);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println("Before operation : " +  stack);
        new DeleteFromMiddle().popMiddle(stack, 0, stack.size());
        System.out.println("After operation : " +  stack);
    }
}
