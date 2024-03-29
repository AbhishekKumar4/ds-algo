package com.abhishek.recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeyPad {

    private void solve(String input, String output, int index, List<String> answer, String[] mappings) {
        if(index >= input.length()) {
            answer.add(output);
            return;
        }

        // digit char nikalo
        int num =  input.charAt(index) - '0';
        String value = mappings[num];

        // recursive call
        for(int i = 0; i < value.length(); i++) {
            output = output.concat(String.valueOf(value.charAt(i)));
            solve(input, output, index + 1, answer, mappings);
            output = output.substring(0, output.length() - 1);
        }
    }
    public List<String> printOutcomes(String input) {
        List<String> answer = new ArrayList<>();
        if(input.length() == 0) {
            return answer;
        }
        String output = "";
        int index = 0;
        String[] keypad = {"",  "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(input, output, index, answer, keypad);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneKeyPad().printOutcomes("23"));
    }
}
