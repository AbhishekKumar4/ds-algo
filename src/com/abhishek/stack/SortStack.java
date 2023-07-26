package com.abhishek.stack;

import java.util.Stack;

public class SortStack {

    public void sort(Stack<Integer> inputStack) {
        //base case
        if(inputStack.isEmpty()){
            return;
        }

        // recursive case
        int temp = inputStack.pop();
        sort(inputStack);
        sortStack(inputStack, temp);
    }

    public void sortStack(Stack<Integer> input, int number) {
        // base case
        if(input.isEmpty()) {
            input.add(number);
            return;
        }
        if(!input.isEmpty() && number > input.peek()) {
            input.add(number);
            return;
        }
        // recursive case
        int temp = input.pop();
        sortStack(input, number);
        input.add(temp);
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
