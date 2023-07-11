package com.abhishek.practice.recursion;

import java.util.Arrays;

public class ReverseString {

    public char[] reverse(char[] input, int start, int end) {
        // base case
        if(start == end) {
            return input;
        }

        // reverse the chars
        char temp = input[start];
        input[start] = input[end];
        input[end] = temp;

        // recursive case
        return reverse(input, start + 1, end -1);
    }

    public static void main(String[] args) {
        String input = "Reverse";
        System.out.println(new ReverseString().reverse(input.toCharArray(), 0, input.length() - 1));
    }
}
