package com.abhishek.revision.stack;

import java.util.Arrays;

public class NextSmallerNumberON2 {

    public int[] nextSmallerNumber(int[] input, int[] output) {
        for(int i = 0; i<= input.length-1; i++) {
            for(int j = i + 1; j<=input.length-1; j++) {
                if(input[j] < input[i]) {
                    output[i] = input[j];
                    break;
                } else {
                    output[i] = -1;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 2, 1, 5, 3, 2 };
        int[] output = new int[input.length];
        output[input.length-1] = -1;
        System.out.println(Arrays.toString(new NextSmallerNumberON2().nextSmallerNumber(input, output)));
    }
}
