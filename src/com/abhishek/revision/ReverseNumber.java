package com.abhishek.revision;

public class ReverseNumber {

    public void reverse(int number) {
        // base case
        if(number < 10) {
            System.out.print(number);
            return;
        } else {
            System.out.print(number % 10);
            reverse(number / 10);
        }
    }

    public static void main(String[] args) {
        new ReverseNumber().reverse(123456789);
    }
}
