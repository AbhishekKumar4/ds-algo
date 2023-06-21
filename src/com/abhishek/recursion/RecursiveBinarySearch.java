package com.abhishek.recursion;

public class RecursiveBinarySearch {

    public int search(int[] input, int target, int start, int end) {
        // base condition
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if(input[mid] == target) {
            return mid;
        }
        if(input[mid] > target) {
            return search(input, target, start, mid - 1);
        }
        return search(input, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 5, 6, 7, 9};
        System.out.println(new RecursiveBinarySearch().search(input, 5, 0, input.length - 1));
    }
}
