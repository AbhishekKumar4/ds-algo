package com.abhishek.revision;

public class PalindromeString {

    public boolean checkPalindrome(int start, int end, String input) {
        // base case
        if(input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // recursive case
        if(start < end) {
            return checkPalindrome(start + 1, end - 1, input);
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "RADAR";
        System.out.println(new PalindromeString().checkPalindrome(0, input.length() -1, input));
    }
}
