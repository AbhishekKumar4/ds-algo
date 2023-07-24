package com.abhishek.binarysearch;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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

    public List breadthFirstSearch() {
        Node currentNode = this.root;
        List<Integer> result = new ArrayList<>();
        Queue queue = new PriorityQueue();
        // add first element to queue
        queue.add(currentNode.data);
        queue.add(currentNode.data);

        while(queue.peek() != null) {
         Node currentNode1 = (Node) queue.poll();
         result.add(currentNode1.data);
         if(currentNode1.left != null) {
             queue.add(currentNode1.left);
         } if(currentNode1.right !=null) {
             queue.add(currentNode1.right);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        myBinarySearchTree.insert(2);
        myBinarySearchTree.insert(5);
        myBinarySearchTree.insert(1);

        System.out.println("Debug and test values");
    }
}
