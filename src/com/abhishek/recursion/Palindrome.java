package com.abhishek.recursion;

public class Palindrome {

    public boolean checkPalindrome(int l, int r, String input) {
       //base case
       if(input.charAt(l) != input.charAt(r)) {
           return false;
       }

       // recursive case
        while(l<r) {
            return checkPalindrome(l+1, r-1, input);
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Abhi";
        System.out.println(new Palindrome().checkPalindrome(0, input.length()- 1, input));
    }
}
