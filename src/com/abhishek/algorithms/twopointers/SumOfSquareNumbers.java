package com.abhishek.algorithms.twopointers;

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);;
        while(left <= right) {
            long sumSquare = left * left + right * right;
            if(c == sumSquare) {
                return true;
            } else if(c < sumSquare) {
                right--;
            } else {
                left ++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int input = 3;
        System.out.println(new SumOfSquareNumbers().judgeSquareSum(input));
    }
}
