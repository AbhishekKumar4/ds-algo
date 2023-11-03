package com.abhishek.stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementLeet {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack();
        stack.push(-1);

        HashMap<Integer, Integer> nums2Keys = new HashMap();

        for(int i = nums2.length - 1; i >= 0; i--) {
            int currentValue = nums2[i];

            while(stack.size() > 0 && currentValue >= stack.peek()) {
                stack.pop();
            }
            if(stack.size() == 0){
                nums2[i] =  -1;
                nums2Keys.put(currentValue, -1);
            } else {
                nums2[i] = stack.peek();
                nums2Keys.put(currentValue, stack.peek());
            }
            stack.push(currentValue);
        }

        for(int j = 0; j<= nums1.length -1; j++) {
            int value =  nums1[j];
            if(nums2Keys.containsKey(value)) {
                nums1[j] = nums2Keys.get(value);
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] num1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(new NextGreaterElement().nextGreaterElement(num1, nums2)));
    }
}
