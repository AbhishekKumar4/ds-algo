package com.abhishek.stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementLeet {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack();
        stack.push(-1);

        HashMap<Integer, Integer> nums1Keys = new HashMap();
        // fill values in map
        for(int i = 0; i<= nums1.length - 1; i++) {
            // stored value and its index
            nums1Keys.put(nums1[i], i);
        }

        for(int j = nums2.length - 1; j >= 0; j--) {
            int currentValue  = nums2[j];
            while(!stack.isEmpty() && stack.peek() < currentValue) {
                stack.pop();
            }
            if(nums1Keys.containsKey(currentValue)) {
                int indexInNums1 = nums1Keys.get(currentValue).intValue();
                nums1[indexInNums1] = stack.peek();
                stack.push(currentValue);
            }
        }
        return nums1;
    }

    public static void main(String[] args) {

    }
}
