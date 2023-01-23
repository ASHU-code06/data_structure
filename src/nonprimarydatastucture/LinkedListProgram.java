package nonprimarydatastucture;
import java.util.Scanner;

public class LinkedListProgram {
     class Node {
        int data;
        Node next;
        Node(int _data) {
            this.data = _data;
            this.next = null;
        }
    }
     Node head=null;
     public void creation(){
         int n=0;
         do{
         System.out.println("Enter data");
         Scanner input=new Scanner(System.in);
         int data= input.nextInt();
         Node new_node=new Node(data);
         if (head==null){
           head=new_node;
         }else {
             new_node.next=head;
             head=new_node;
         }
         System.out.println("Do you want to enter more data if yes then press 1,if no then press 2");
         n= input.nextInt();
         }while(n==1);
     }
     public void traverse(){
         Node temp=head;
         if(temp==null){
             System.out.println("Linked list does not exist");
         }else {
             System.out.println("Linked list is  ");
             while (temp!=null){
             System.out.println(temp.data);
             temp=temp.next;}
         }
     }
    public static void main(String[] args){
        LinkedListProgram linkedListProgram=new LinkedListProgram();
        linkedListProgram.creation();
        linkedListProgram.traverse();
    }


}
