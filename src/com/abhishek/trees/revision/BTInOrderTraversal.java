package com.abhishek.trees.revision;

import java.util.ArrayList;
import java.util.List;

public class BTInOrderTraversal {

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<Integer>();
        inOrder(root, answer);
        return answer;
    }

    private void inOrder(TreeNode treeNode, List<Integer> answer) {
        // base case
        if(treeNode == null) {
            return;
        }

        // Left Node Right
        inOrder(treeNode.left, answer);
        answer.add(treeNode.val);
        inOrder(treeNode.right, answer);
    }

    public static void main(String[] args) {

    }
}
