package com.abhishek.linkedlist;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

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

    public void printMiddle() {
        // construct a new node
        // middle kese nikaalein // two pointer game - fast pointer and slow pointer game
        // when fast pointer reaches end, slow will be at the middle
        Node currentNode = this.head;
        // initially both will be at start
        Node fastPointer = currentNode;
        Node slowPointer = currentNode;

        while(fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        // when fast reaches the end, the slow one will be at the middle
        System.out.println("Middle element is L " + slowPointer.data);
    }

    public void insertAtIndex(int index, int data) {
        Node newNode = new Node(data, null);
        Node currentNode =  this.head;
        int counter = 0;
        // last tak while loop kro
        while(counter < index) {
            currentNode = currentNode.next;
            counter = counter + 1;
        }

        // yahan pe current.next null hai
        Node temp = currentNode.next;
        currentNode.next = newNode;
        newNode.next =  temp;
    }

    public void printLinkedList() {
        Node currenNode =  this.head;
        while( currenNode != null) {
            System.out.print(currenNode.data + " ");
            currenNode = currenNode.next;
        }
    }

    public void deleteNodeFromIndex(int index) {
        Node currentNode =  this.head;
        int counter =  0;

        // case delete from first position
        if(index == 0) {
            Node tempNode = this.head;
            this.head  = tempNode.next;
            tempNode.next =  null;
        } else {
            // shuru me previous null hogi
            Node previous =  null;
            while(counter < index) {
                previous = currentNode;
                currentNode =  currentNode.next;
                counter++;
            }
            previous.next = currentNode.next;
            currentNode.next = null;
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
        System.out.println("=============================");
        myLinkedList.printMiddle();
    }
}
