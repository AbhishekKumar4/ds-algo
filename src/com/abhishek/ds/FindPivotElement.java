package com.abhishek.binarysearch.practice;

public class FindPivotElement {

    public int findPivot(int[] input) {
        int start = 0;
        int end = input.length;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(input[mid] >= input[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] input = { 4, 6, 8, 9, 1, 2, 3 };
        System.out.println(new FindPivotElement().findPivot(input));
    }
}
