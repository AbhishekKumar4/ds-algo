package com.abhishek.recursion;

public class BinarySearch {

    public int search(int[] input, int start, int end, int key) {
        // base case
        if(start > end) {
            return -1; // element not found
        }
        // calculate mid
        int mid = start + (end - start) / 2;

        if(input[mid] == key) {
            return mid;
        } else if(input[mid] > key) {
            return search(input, start, mid - 1 , key);
        } else {
            return search(input, start + 1, end, key);
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 7, 9, 10};
        int start = 0;
        int end = input.length - 1;
        System.out.println(new BinarySearch().search(input, start, end, 4));
    }
}
