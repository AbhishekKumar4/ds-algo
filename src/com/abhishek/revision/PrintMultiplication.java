package com.abhishek.revision;

public class PrintMultiplication {

    public void printMultiplication(int start, int end, int number) {
        //base case
        if(start == end) {
            return;
        }

        System.out.println(number + " * " + start + " = " + (start * number));
        // recursive case
        printMultiplication(start + 1, end, number);
    }

    public static void main(String[] args) {
        new PrintMultiplication().printMultiplication(1, 10, 2);
    }
}
