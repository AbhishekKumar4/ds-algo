package com.abhishek.stack;

import java.util.Stack;

public class FinalPricesWithSpecialDiscountInShop {


    public int[] finalPrices(int[] prices) {
        int[] output =  new int[prices.length];
        output = checkNextSmallerNumbers(prices, output);

        // half baked
        // compare and return
        return output;
    }

    private int[] checkNextSmallerNumbers(int[] input, int[] output) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i  = input.length - 1; i >=0; i--) {
            int currentValue =  input[i];
            while(!stack.isEmpty() && stack.peek() != -1 && stack.peek() > currentValue) {
                stack.pop();
            }
            output[i] = stack.peek();
            stack.push(currentValue);
        }
        return output;
    }

    public static void main(String[] args) {
        int input[] = { 8, 4, 6, 2, 3 };
    }
}
