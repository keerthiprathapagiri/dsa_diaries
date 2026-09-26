// Question: Implement a singly linked list with insertion and node counting.
// Input: Insert 10 at beginning, then 20, 30, 40, 50 at the end, then insert 0 at beginning.
// Output:
// Original LinkedList:10->20->30->40->50->null
// Changed LinkedList:0->10->20->30->40->50->null
// total nodes=6

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert_at_beg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insert_at_end(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    void count_node() {
        int count = 0;
        Node now = head;

        while (now != null) {
            count++;
            now = now.next;
        }

        System.out.println("total nodes=" + count);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert_at_beg(10);
        ll.insert_at_end(20);
        ll.insert_at_end(30);
        ll.insert_at_end(40);
        ll.insert_at_end(50);

        System.out.print("Original LinkedList:");
        ll.display();

        ll.insert_at_beg(0);

        System.out.println("Changed LinkedList:");
        ll.display();

        ll.count_node();
    }
}