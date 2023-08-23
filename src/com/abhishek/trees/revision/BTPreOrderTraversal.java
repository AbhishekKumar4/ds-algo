package com.abhishek.trees.revision;

import java.util.ArrayList;
import java.util.List;

public class BTPreOrderTraversal {

    public List<Integer> preOrderTraversal(BTInOrderTraversal.TreeNode root) {
        List<Integer> answer = new ArrayList<Integer>();
        preOrder(root, answer);
        return answer;
    }

    private void preOrder(BTInOrderTraversal.TreeNode treeNode, List<Integer> answer) {
        // base case
        if(treeNode == null) {
            return;
        }

        // Node Left Right
        answer.add(treeNode.val);
        preOrder(treeNode.left, answer);
        preOrder(treeNode.right, answer);
    }
}
