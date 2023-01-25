package nonprimarydatastucture;
import java.util.Scanner;

public class queue {
   int front=-1,rear=-1;
   int n=0;//size of array
   int q[]=new int[n];

   void enqueue(Scanner var){
       if (rear==(n-1)){
           System.out.println("Overflow condition");
       }else{
           System.out.println("Enter data");
           int i= var.nextInt();
           if (front==-1 && rear==-1){
               front=0;
               rear=0;
               q[rear]=i;
           }else {
               rear=rear+1;
               q[rear]=i;
           }
       }

   }
   void dequeue(){
       if (front==-1 && rear==-1){
           System.out.println("Underflow Condition");
       }else {
           front=front+1;
       }

   }
   void display(){
       System.out.println("Items are  : \n");
       for(int i=front;i<=rear;i++){
           System.out.println(q[i]"\n");
       }
   }
}





