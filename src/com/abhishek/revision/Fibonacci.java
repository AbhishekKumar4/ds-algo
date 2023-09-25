package com.abhishek.revision;

public class Fibonacci {

    public int fibo(int input) {
        // base case
        if(input == 0) {
            return 0;
        }

        if(input == 1) {
            return 1;
        }

        // recursive case
        return fibo(input - 1) + fibo(input - 2);

    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibo(3));
    }
}
