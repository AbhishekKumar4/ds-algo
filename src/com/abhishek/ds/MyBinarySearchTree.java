package com.abhishek.ds;

public class MyBinarySearchTree {
    Node root;
    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            this.root = newNode;
        } else {
            Node currentNode = this.root;
            while(true) {
                if(value < currentNode.data) {
                    //Go Left
                    if(currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    // Move right
                    if(currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }
}
