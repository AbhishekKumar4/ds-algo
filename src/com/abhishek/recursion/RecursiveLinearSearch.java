package com.abhishek.recursion;

public class RecursiveLinearSearch {
    public int search(int[] input, int target, int start, int end) {
        // base case
        if(start >= end) {
            return -1;
        }
        if(input[start] == target) {
            return start;
        } else {
            return search(input, target, start + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] input = {2, 3, 5, 6, 7, 9};
        System.out.println(new RecursiveLinearSearch().search(input, 10, 0, input.length-1));
    }
}
