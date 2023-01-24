package nonprimarydatastucture;

import java.util.Scanner;
import java.util.Stack;

public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int _data){
            this.data=_data;
            this.next=null;
        }
    }
    Node top =null;

   void push(Scanner var){
       System.out.println("Enter data to push in stack");
       int data=var.nextInt();
       add(data);
   }
   void pop(){
    if (top==null){
        System.out.println("Stack is empty");
    }else{
        System.out.println("done");
        top=top.next;
    }
   }
   void display(){
   Node temp=top;
   while(temp!=null){
       System.out.println(temp.data);
       temp=temp.next;
   }
   }
   void add(int data){
       Node new_node=new Node(data);
       if (top==null){
           top=new_node;
       }else {
           new_node.next=top;
           top=new_node;
       }
   }

    public static void main (String[]args)  {

        StackUsingLinkedList ll = new StackUsingLinkedList();
        Stack s=new Stack();
        Scanner var = new Scanner(System.in);
        int loopvar;
        do{
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to display");
            System.out.println("Enter your choice");
            int input=var.nextInt();
            switch (input){
                case 1:
                    s.push(var);
                    ll.push(var);
                    break;
                case 2 :
                    s.pop();
                    ll.pop();
                    break;
                case 3:
                    ll.display();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
            System.out.println("Enter 0 to go back to main menu or Enter 1 to go exit");
            loopvar= var.nextInt();
        }while(loopvar==0);
        System.out.println("Exit successfully");

    }
}



