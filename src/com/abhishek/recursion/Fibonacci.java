package com.abhishek.recursion;

public class Fibonacci {

    public int fibonacci(int input) {
        // 0 1 1 2 3 5 8 13 21 43
        // base case
        if(input == 0 ) {
            return 0;
        }
        if(input == 1) {
            return 1;
        }
        // recursive case
        // relation fibo is addition of (n-1) + (n-2)
        return fibonacci(input - 1) + fibonacci(input - 2);
    }
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(4));
    }
}
