package com.abhishek.binarysearch;

public class FindPeak {

    public int findPeak(int[] input) {
        int start = 0;
        int end = input.length;

        while(start < end) {
            // find mid
            int mid =  start + (end - start) / 2;
            if(input[mid] < input[mid+1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 4, 3, 2, 1 };
        System.out.println(new FindPeak().findPeak(input));
    }
}
