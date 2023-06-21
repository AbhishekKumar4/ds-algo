package com.abhishek.practice.recursion;

public class PrintCounting {

    public void printCounting(int start, int end) {
        // base case
        if(start == end) {
            return;
        }

        System.out.println(start);
        // recursive case
        printCounting(start + 1, end);
    }

    public static void main(String[] args) {
        int start=0;
        int end = 100;
        new PrintCounting().printCounting(start, end);
    }
}
