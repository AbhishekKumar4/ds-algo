package com.abhishek.trees;

public class BinaryTreeDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight =  maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        int ans = maxOf(leftHeight, rightHeight) + 1;
        return ans;
    }

    private int maxOf(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
