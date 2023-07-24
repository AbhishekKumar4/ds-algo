package com.abhishek.stack;

import java.util.Stack;

public class ValidParanthesis {

    public boolean isValid(String input) {
        Stack stack = new Stack();

        for(int i = 0; i < input.length() ; i++) {
            // push char if stack is empty
            if(stack.isEmpty()) {
                stack.push(input.charAt(i));
            } else {
                char fromStack = (char)stack.peek();
                char currentChar =  input.charAt(i);
                if((fromStack == '(' && currentChar == ')')
                || (fromStack == '{' && currentChar == '}')
                || (fromStack == '[' && currentChar == ']')) {
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
        String paranthesis = "[](){}";
        System.out.println(new ValidParanthesis().isValid(paranthesis));
    }
}
