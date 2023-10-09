package com.abhishek.revision.stack;

import com.abhishek.stack.ValidParanthesis;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String input) {
        Stack stack = new Stack();

        for(int i = 0; i< input.length(); i++) {
            if(stack.isEmpty()) {
                stack.add(input.charAt(i));
            } else {
                char fromStack =  (char) stack.peek();
                char currentChar = input.charAt(i);
                if(fromStack == '[' && currentChar == ']'
                    || fromStack == '(' && currentChar == ')'
                    || fromStack == '{' && currentChar == '}') {
                    // clear the stack
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "[](){}";
        System.out.println(new ValidParenthesis().isValid(input));
    }
}
