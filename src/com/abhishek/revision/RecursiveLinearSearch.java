package com.abhishek.revision;

public class RecursiveLinearSearch {

    public int search(int start, int end, int target, int[] inputArray) {
        // base condition
        if(start >= end) {
            return -1;
        }

        // recursive conditions
        if(inputArray[start] == target) {
            return start;
        } else {
            return search(start + 1, end, target, inputArray);
        }
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 5, 8, 10, 15, 18 };
        System.out.println(new RecursiveLinearSearch().search(0, input.length - 1, 20, input));
    }
}
