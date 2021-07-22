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

    public Node traverseToIndex(int index) {
        int count = 0;
        Node currentnode = this.head;
        while(count != index) {
            currentnode = currentnode.next;
            count++;
        }
        return currentnode;
    }

    public void remove(int index) {
        Node leader = traverseToIndex(index - 1);
        Node toRemove = leader.next;
        leader.next= toRemove.next;
        toRemove.next = null;
    }

    public void reverse() {
        Node current = this.head;
        Node previous = null;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(3);
        myLinkedList.append(7);
        myLinkedList.append(2);
        myLinkedList.append(1);

        myLinkedList.displayContent();

        myLinkedList.reverse();

        System.out.println("/nAfter Reversing");
        myLinkedList.displayContent();

    }

}
