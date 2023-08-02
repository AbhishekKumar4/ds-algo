package com.abhishek.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_LEET {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer =  new ArrayList<Integer>();
        postOrder(root, answer);
        return answer;
    }

    private void postOrder(TreeNode root, List<Integer> answer) {
        // base case
        if(root == null) {
            return;
        }

        // go left
        postOrder(root.left, answer);
        // go right
        postOrder(root.right, answer);
        // visit node
        answer.add(root.val);
    }
}
