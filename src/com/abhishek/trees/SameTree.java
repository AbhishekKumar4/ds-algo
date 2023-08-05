package com.abhishek.trees;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // base cases
        if(p == null && q == null) {
            return true;
        }

        if(p == null && q != null) {
            return false;
        }

        if(p != null && q == null) {
            return false;
        }

        boolean left =  isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        boolean value = p.val == q.val;

        if(left && right && value) {
            return true;
        } else {
            return false;
        }
    }

}
