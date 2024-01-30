package com.abhishek.algorithms.twopointers;


import java.util.Arrays;

/*
167. Two Sum II - Input Array Is Sorted
*/
public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int low = 0;
        int high = numbers.length -1;
        while(low < high) {
            if(target == numbers[low] + numbers[high]) {
                answer[0] = low;
                answer[1] = high;
                return answer;
            }
            if(target < numbers[low] + numbers[high]) {
                high--;
            } else {
                low++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] input = { -3, -1, 0, 3, 6, 8, 10 };
        int target = 6;
        System.out.println(Arrays.toString(new TwoSum2().twoSum(input, target)));

    }
}
