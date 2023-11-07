package com.abhishek.linkedlist;

public class MyCustomLinkedList {

    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data =  data;
            this.next = next;
        }
    }

    public void insertAtBegining(int data) {
        // construct a new node
        Node newNode = new Node(data, null);
        if(this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = head;
            this.head = newNode;
        }
    }

    public void insertAtTail(int data) {
        // construct a new node
        Node newNode = new Node(data, null);
        Node currentNode =  this.head;
        // last tak while loop kro
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        // yahan pe current.next null hai
        currentNode.next = newNode;
    }

    public void insertAtMiddle(int data) {
        // construct a new node
        // middle kese nikaalein // two pointer game - fast pointer and slow pointer game
        // when fast pointer reaches end, slow will be at the middle
    }

    public void printLinkedList() {
        Node currenNode =  this.head;
        while( currenNode != null) {
            System.out.print(currenNode.data + " ");
            currenNode = currenNode.next;
        }
    }
    
    public static void main(String[] args) {
        MyCustomLinkedList myLinkedList = new MyCustomLinkedList();
        myLinkedList.insertAtBegining(10);
        myLinkedList.insertAtBegining(20);
        myLinkedList.insertAtBegining(30);
        myLinkedList.insertAtBegining(40);
        myLinkedList.insertAtBegining(50);
        myLinkedList.insertAtTail(60);
        myLinkedList.insertAtTail(70);
        myLinkedList.insertAtTail(80);

        myLinkedList.printLinkedList();
    }
}
