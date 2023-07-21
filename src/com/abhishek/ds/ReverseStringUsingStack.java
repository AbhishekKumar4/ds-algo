package com.abhishek.stacknqueues.practice;

import java.util.Stack;

public class ReverseStringUsingStack {
    public String reverse(String input) {
        Stack stack  = new Stack();
        for(int i  = 0; i < input.length() ; i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "reversethisstring";
        System.out.println(new ReverseStringUsingStack().reverse(input));
    }
}
