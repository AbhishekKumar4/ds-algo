package com.abhishek.trees;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        boolean diff = Math.abs(height(root.left) - height(root.right)) >=1;
        if( left && right && diff) {
            return true;
        } else {
            return false;
        }
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        int height = maxOf(left, right) + 1;
        return height;
    }

    private int maxOf(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

    }
}
