package com.abhishek.recursion;

public class SayDigits {

    String[] dictionary = {"zero", "one", "two", "three", "four", "five"
                            , "six", "seven", "eight", "nine", "ten"};
    public void sayDigits(int input) {
        // base case
        if(input == 0) {
            return;
        }
        int digit = input % 10;
        input = input / 10;

        // recursive call
        sayDigits(input);
        System.out.println(dictionary[digit]);

    }

    public static void main(String[] args) {
        new SayDigits().sayDigits(1234);
    }
}
