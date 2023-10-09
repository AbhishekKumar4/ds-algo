package com.abhishek.revision.stack;

import com.abhishek.revision.ReverseString;

import java.util.Stack;

public class ReverseStringUsingStack {

    public String reverse(String input) {
        if(input.length() == 1) {
            System.out.println("Only had one char in string");
            return input;
        }

        Stack stack = new Stack();
        for(int i  = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.add(ch);
        }

        StringBuilder stringBuilder =  new StringBuilder();
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(new ReverseStringUsingStack().reverse("I will win"));
    }
}
