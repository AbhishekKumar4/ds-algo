package com.abhishek.revision.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerNumberUsingStackImprovedLogic {

    public int[] nextSmallerNumberUsingStack(int[] input, int[] output) {
        Stack<Integer> stack = new Stack<Integer>();
        // first would be -1
        stack.push(-1);

        for(int i = input.length - 1; i>=0; i--) {
            int currentValue = input[i];
            while(stack.peek() > currentValue) {
                stack.pop();
            }
            output[i] = stack.peek();
            stack.push(currentValue);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 2, 1, 5, 3, 2 };
        int[] output = new int[input.length];
        System.out.println(Arrays.toString(new NextSmallerNumberUsingStackImprovedLogic().nextSmallerNumberUsingStack(input, output)));
    }
}
