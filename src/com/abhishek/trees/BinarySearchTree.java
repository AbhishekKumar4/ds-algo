package com.abhishek.trees;

public class BinarySearchTree {
    private Node root;
    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data =  data;
            this.left =  null;
            this.right = null;
        }
    }
    public void insert(int data) {
        Node newNode =  new Node(data);
        if(root == null) {
            root  = newNode;
        } else {
            Node currentNode = this.root;
            while(true) {
                if(data < currentNode.data) {
                    // go left
                    if(currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode =  currentNode.left;
                } else {
                    // go right
                    if(currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode =  currentNode.right;
                }
            }
        }
    }
}
