package com.abhishek.trees;

public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if(root == null) {
            return 0;
        }

        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }

        if(root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if(root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }


    public static void main(String[] args) {
        TreeNode leftLeftChild = new TreeNode(3);
        TreeNode leftRightChild =  new TreeNode(7);
        TreeNode left =  new TreeNode(5, leftLeftChild, leftRightChild);

        TreeNode rightRightChild = new TreeNode(18);

        TreeNode right = new TreeNode(15, null, rightRightChild);
        TreeNode root =  new TreeNode(10, left, right);

        //        10
        //   5          15
        //3    7            18
        //
        System.out.println(new RangeSumOfBST().rangeSumBST(root, 7, 15));
    }
}
