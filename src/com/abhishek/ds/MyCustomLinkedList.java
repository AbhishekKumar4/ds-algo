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

        myLinkedList.printLinkedList();
    }
}
