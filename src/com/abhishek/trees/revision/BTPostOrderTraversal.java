package com.abhishek.trees.revision;

import java.util.ArrayList;
import java.util.List;

public class BTPostOrderTraversal {

    public List<Integer> postOrderTraversal(BTInOrderTraversal.TreeNode root) {
        List<Integer> answer = new ArrayList<Integer>();
        postOrder(root, answer);
        return answer;
    }

    private void postOrder(BTInOrderTraversal.TreeNode treeNode, List<Integer> answer) {
        // base case
        if(treeNode == null) {
            return;
        }

        // Left Right Node
        postOrder(treeNode.left, answer);
        postOrder(treeNode.right, answer);
        answer.add(treeNode.val);
    }
}
