package com.abhishek.algorithms.twopointers;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        // base case
        if(nums == null || nums.length <3) return new ArrayList<>();

        // sort the array
        Arrays.sort(nums);

        Set<List<Integer>> answer = new HashSet<>();

        for(int i = 0; i<= nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum =  nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList(answer);
    }
}
