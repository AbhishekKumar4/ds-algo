package com.abhishek.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    // Implement Level Order Traversal // Breadth first search
    // Implemented by using queues
    public List breadthFirstSearch() {
        Node currentNode =  this.root;
        List<Integer> result =  new ArrayList<>();
        LinkedList<Node> queue =  new LinkedList<>();

        // add first element
        queue.add(currentNode);

        while(queue.peek() != null) {
            // poll and add data
            Node node =  queue.poll();
            result.add(node.data);
            // left add karao
            if(node.left != null) {
                queue.add(node.left);
            }
            // right add karao
            if(node.right != null) {
                queue.add(node.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(11);
        binarySearchTree.insert(17);

        System.out.println(binarySearchTree.breadthFirstSearch());
    }
}
