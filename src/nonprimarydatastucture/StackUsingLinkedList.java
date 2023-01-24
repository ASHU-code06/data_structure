package nonprimarydatastucture;

import java.util.Scanner;
import java.util.Stack;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int _data) {
            this.data = _data;
            this.next = null;
        }
    }

    Node top = null;

    void push(Scanner var) {
        System.out.println("Enter data to push in stack");
        int data = var.nextInt();
        add(data);
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("done");
            top = top.next;
        }
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void add(int data) {
        Node new_node = new Node(data);
        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
    }
}





