package com.abhishek.revision;

import com.abhishek.recursion.BinarySearch;

public class RecursiveBinarySearch {

    public int search(int start, int end, int[] input, int target) {
        // base case
        if(start > end) {
            return -1;
        }
        // find mid
        int mid = start + (end - start) / 2;

        if(input[mid] == target) {
            return mid;
        } else if (input[mid] > target) {
            return search(start, mid - 1, input, target);
        } else {
            return search(start + 1, end, input, target);
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 7, 9, 10};
        int start = 0;
        int end = input.length - 1;
        System.out.println(new BinarySearch().search(input, start, end, 4));
    }
}
