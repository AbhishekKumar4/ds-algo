package com.abhishek.trees;

public class BinaryTreeWidth {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int option1 = widthOfBinaryTree(root.left);
        int option2 = widthOfBinaryTree(root.right);
        int option3 = maxDepth(root.left) + maxDepth(root.right) + 1;
        return maxOf(option1, maxOf(option2, option3));
    }

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
