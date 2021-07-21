package com.abhishek.ds;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public void append(int data) {
        // create a new node
        Node newNode = new Node(data);
        newNode.next = null;
        if(this.head == null){
            this.head = newNode;
        } else {
            Node last = this.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void displayContent() {
        Node current = head;
        while(current != null) {
            System.out.print("[" + current.data + "]");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(3);
        myLinkedList.append(7);
        myLinkedList.append(2);

        myLinkedList.displayContent();
    }

}
