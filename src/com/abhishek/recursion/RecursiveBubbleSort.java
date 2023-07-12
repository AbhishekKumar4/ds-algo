package com.abhishek.recursion;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public void sort(int[] input, int n) {
        // base case
        if(n == 0 || n == 1) {
            return;
        }

        // do the swap
        for(int i = 0; i < n - 1; i++) {
            if(input[i] > input[i+1]) {
                // swap them
                int temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
            }
        }

        // recursive case
        sort(input, n - 1);
    }

    public static void main(String[] args) {
        int[] input = {1, 4, 7, 2, 3, 8, 6};
        new RecursiveBubbleSort().sort(input, input.length);
        System.out.println(Arrays.toString(input));
    }
}
