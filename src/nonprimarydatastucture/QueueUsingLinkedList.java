package nonprimarydatastucture;
import java.util.Scanner;
public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int _data) {
            this.data = _data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear=null;
    void enqueue(Scanner var) {
        System.out.println("Enter data to enqueue in queue");
        int data = var.nextInt();
        append(data);
    }
    void display() {
        Node temp = front;//pointer of type Node
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        if (front == null) {
            System.out.println("This queue is empty");}
    }
    void append(int data) {
        Node new_node = new Node(data);
        if (front == null) {
            front = new_node;
            rear = new_node;
        } else {
           rear.next=new_node;
           rear=new_node;
        }
    }
}





