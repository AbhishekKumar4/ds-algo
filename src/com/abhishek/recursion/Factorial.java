package com.abhishek.practice.recursion;

public class Factorial {

    public int factorial(int input) {
        // base case
        if(input == 0){
            return 1;
        }
        // recursive case
        return input * factorial(input - 1);
    }
    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(4));
    }
}
