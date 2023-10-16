package com.abhishek.revision.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerNumber {

    public int[] nextSmallerNumber(int[] input) {
        int[] output = new int[input.length];
        Stack stack = new Stack();
        stack.push(-1);
        nextNumber(input, output, stack);
        return output;
    }

    private void nextNumber(int[] input, int[] output, Stack<Integer> stack) {
        for(int i = input.length - 1 ; i >= 0; i--) {
            int current =  input[i];
            while(stack.peek() >= current) {
                // keep popping
                stack.pop();
            }
            // ans is stack ka top
            output[i] = stack.peek();
            stack.push(current);
        }
    }


    public static void main(String[] args) {
        int[] input = { 4, 1, 5, 3 };
        System.out.println(Arrays.toString(new NextSmallerNumber().nextSmallerNumber(input)));
    }
}
