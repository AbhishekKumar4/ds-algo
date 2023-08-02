package com.abhishek.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_LEET {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<Integer>();
        inOrder(root, answer);
        return answer;
    }

    public void inOrder(TreeNode root, List<Integer> answer) {
        // base case
        if(root == null) {
            return;
        }
        // go left
        inOrder(root.left, answer);
        // visit node
        answer.add(root.val);
        // go right
        inOrder(root.right, answer);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}