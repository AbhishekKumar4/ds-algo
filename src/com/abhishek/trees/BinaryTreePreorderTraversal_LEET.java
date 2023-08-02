package com.abhishek.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_LEET {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<Integer>();
        preOrder(root, answer);
        return answer;
    }

    public void preOrder(TreeNode root, List<Integer> answer) {
        // base case
        if(root == null) {
            return;
        }

        // visit node
        answer.add(root.val);
        // go left
        preOrder(root.left, answer);
        // go right
        preOrder(root.right, answer);
    }
}
