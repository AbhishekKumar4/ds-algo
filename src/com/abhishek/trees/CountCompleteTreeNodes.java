package com.abhishek.trees;

public class CountCompleteTreeNodes {


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


    }
}
