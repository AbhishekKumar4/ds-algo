package com.abhishek.binarysearch.practice;

public class BinarySearch {

    public int search(int[] input, int target) {
        int start = 0;
        int end = input.length;

        while(start < end) {
            int mid = start  + (end - start) / 2;
            if(input[mid] == target) {
                return mid;
            } else if (input[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        // if target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 7, 9, 10, 13, 18, 77};
        System.out.println(new BinarySearch().search(input, 13));
    }
}
