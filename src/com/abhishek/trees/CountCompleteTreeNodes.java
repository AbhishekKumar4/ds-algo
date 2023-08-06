package com.abhishek.trees;

public class CountCompleteTreeNodes {
    public int countTreeNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int answer = countAllNodes(root);
        return answer;
    }
    private int countAllNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lh = countAllNodes(root.left);
        int rh = countAllNodes(root.right);
        return lh + rh + 1;
    }

    public static void main(String[] args) {

        TreeNode leftLeftChild = new TreeNode(4);
        TreeNode leftRightChild =  new TreeNode(5);
        TreeNode left =  new TreeNode(2, leftLeftChild, leftRightChild);

        TreeNode rightLeftChild = new TreeNode(6);

        TreeNode right = new TreeNode(3, rightLeftChild, null);
        TreeNode root =  new TreeNode(1, left, right);

        //        1
        //   2          3
        //4    5      6
        //

        System.out.println(new CountCompleteTreeNodes().countTreeNodes(root));

    }
}
