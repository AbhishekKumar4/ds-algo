package com.abhishek.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String input1, String input2) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i <= input1.length() - 1; i++) {
            if(input1.charAt(i) != '#') {
                stack.push(input1.charAt(i));
            }
            if(input1.charAt(i) == '#') {
                // # mila to backspace, pop kr do
                stack.pop();
            }
        }
        String string1 = stack.stream().map(s -> s.toString()).collect(Collectors.joining(""));
        stack.removeAllElements();
        for(int i = 0; i <= input2.length() - 1; i++) {
            if(input1.charAt(i) != '#') {
                stack.push(input2.charAt(i));
            }
            if(input2.charAt(i) == '#') {
                // # mila to backspace, pop kr do
                stack.pop();
            }
        }
        String string2 = stack.stream().map(s -> s.toString()).collect(Collectors.joining(""));
        if(string1.equals(string2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String input1 = "ab#c";
        String input2 = "ad#c";

        new BackspaceStringCompare().backspaceCompare(input1, input2);
    }
}
