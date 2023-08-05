package com.abhishek.trees;

public class RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        if(root == null) {
            return false;
        }
        return root.val == (root.left.val + root.right.val) ? true : false;
    }
}
