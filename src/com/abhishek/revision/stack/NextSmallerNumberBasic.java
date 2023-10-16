package com.abhishek.revision.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerNumberBasic {


    public int[] nextSmallerNumber(int[] input) {
        int[] output = new int[input.length];
        output[input.length-1] = -1;
        nextNumber(input, output);
        return output;
    }

    private void nextNumber(int[] input, int[] output) {
        for(int i = 0; i <= input.length - 1 ; i++) {
            for(int j = i + 1; j <= input.length - 1; j++) {
                System.out.println("kaise");
                if(input[j] < input[i]) {
                    output[i] = input[j];
                    break;
                } else {
                    output[i] = -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] input = { 4, 1, 5, 3 };
        System.out.println(Arrays.toString(new NextSmallerNumberBasic().nextSmallerNumber(input)));
    }
}
