package com.abhishek.practice.recursion;

public class ClimbingStairs {

    public int climbStairs(int stair) {
        // base case
        if(stair < 0) {
            return 0;
        }
        if(stair == 1) {
            return 1;
        }
        // recursive case
        return climbStairs(stair - 1) + climbStairs(stair - 2);
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(3));
    }
}
