package com.abhishek.revision;

public class PrintNumbers {

    public void printNumbers(int start, int end) {
        //base case
        if(start == end) {
            return;
        }

        System.out.println(start);
        printNumbers(start + 1, end);
    }

    public static void main(String[] args) {
        new PrintNumbers().printNumbers(0, 20);
    }
}
