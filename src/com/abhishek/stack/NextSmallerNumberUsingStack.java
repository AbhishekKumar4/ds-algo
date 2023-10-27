package com.abhishek.revision.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerNumberUsingStack {

    public int[] nextSmallerNumberUsingStack(int[] input, int[] output) {
        Stack<Integer> stack = new Stack<Integer>();
        // first would be -1
        stack.push(-1);

        for(int i = input.length - 1; i>=0; i--) {
            int value = stack.peek();
            if(value < input[i]) {
                output[i] = value;
                stack.push(input[i]);
            } else {
                // stack ki value greater hai, to pop kro jab tak smaller na mile
                while(stack.peek() > input[i]) {
                    stack.pop();
                }
                int lesserValue = stack.peek();
                output[i] = lesserValue;
                stack.push(input[i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 2, 1, 5, 3, 2 };
        int[] output = new int[input.length];
        System.out.println(Arrays.toString(new NextSmallerNumberUsingStack().nextSmallerNumberUsingStack(input, output)));
    }
}
