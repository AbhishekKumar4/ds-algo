package com.abhishek.binarysearch.practice;

public class FindSquareRoot {

    public int findRoot(int input) {
        int start = 0;
        int target = input;
        int end = input;
        int ans = 0;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(mid * mid == target) {
                return mid;
            } else if(mid * mid < target) {
                start = mid + 1;
                // exact root nai hai to closest return krna hai
                ans =  mid;
            } else {
                end = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int input = 36;
        System.out.println(new FindSquareRoot().findRoot(input));
    }
}
