package com.abhishek.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public void subsets(int[] input, int index, List<Integer> output, List<List<Integer>> answer) {
        // base case
        if(index == input.length) {
            answer.add(new ArrayList<>(output));
            return;
        }

        // exclude case
        subsets(input, index + 1, new ArrayList<>(output), answer);
        // include case
        int value  =  input[index];
        output.add(value);
        subsets(input, index + 1, output, answer);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        List<Integer> output = new ArrayList();
        List<List<Integer>> answer = new ArrayList<>();
        new Subsets().subsets(input, 0, output, answer);
    }
}
