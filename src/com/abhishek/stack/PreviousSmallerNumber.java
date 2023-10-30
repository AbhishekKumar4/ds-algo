package com.abhishek.stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerNumber {

    public int[] previousSmallerNumber(int[] input, int[] output) {
        Stack<Integer> stack = new Stack();
        stack.push(-1);

        for(int i = 0; i<= input.length - 1; i++) {
            int currentValue = input[i];
            while(!stack.isEmpty() && stack.peek() > currentValue) {
                // jab tak badi value mil rhi hai pop krte rho
                stack.pop();
            }
            output[i] = stack.peek();
            stack.push(currentValue);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 2, 3, 1, 7 , 9 };
        int[] output = new int[input.length];
        System.out.println(Arrays.toString(new PreviousSmallerNumber().previousSmallerNumber(input, output)));
    }
}
