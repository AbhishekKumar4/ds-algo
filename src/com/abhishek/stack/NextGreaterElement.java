package com.abhishek.stack;

import com.abhishek.revision.stack.NextSmallerNumber;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterNumberUsingStack(int[] input, int[] output) {
        Stack<Integer> stack = new Stack<Integer>();
        // last se bada to kuch nai hoga
        stack.push(-1);

        for(int i = input.length - 1; i >= 0; i--) {
            int currentValue = input[i];

            while(stack.size() > 0 && currentValue >= stack.peek()) {
                stack.pop();
            }
            if(stack.size() == 0){
                output[i] =  -1;
            } else {
                output[i] = stack.peek();
            }
            stack.push(currentValue);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 2, 1, 5, 3, 2 };
        int[] output = new int[input.length];
        System.out.println(Arrays.toString(new NextGreaterElement().nextGreaterNumberUsingStack(input, output)));
    }
}
