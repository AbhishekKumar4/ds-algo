package com.abhishek.revision.stack;

import java.util.Stack;

public class SortStack {

    public void sort(Stack stack) {
        // base case
        if(stack.isEmpty()) {
            return;
        }

        int element = (int) stack.pop();
        sort(stack);
        sortStack(element, stack);
    }

    private void sortStack(int element, Stack stack) {
        // base condition
        if(stack.isEmpty()) {
            stack.add(element);
            return;
        }
        // second base condition
        if(!stack.isEmpty() && element > (int)stack.peek()) {
            stack.add(element);
            return;
        }

        int popped =  (int) stack.pop();
        sortStack(element, stack);
        stack.add(popped);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(2);
        stack.add(7);
        stack.add(1);
        stack.add(6);
        System.out.println("Before operation : " +  stack);
        new SortStack().sort(stack);
        System.out.println("After operation : " +  stack);
    }
}
