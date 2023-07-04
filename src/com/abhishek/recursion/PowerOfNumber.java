package com.abhishek.practice.recursion;

public class PowerOfNumber {

    public long calculate(int n, int power) {
        // base case
        if(power == 0){
            return 1;
        }
        // recursive case
        return n * calculate(n, power -1 );
    }

    public static void main(String[] args) {
        PowerOfNumber pn = new PowerOfNumber();
        System.out.println(pn.calculate(5, 3));
    }
}
