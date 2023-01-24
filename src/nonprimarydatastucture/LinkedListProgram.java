package nonprimarydatastucture;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class LinkedListProgram {
    static class Node{
        int data;
        Node next;
        Node(int _data){
            this.data=_data;
            this.next=null;
        }
    }
    Node head =null;


    public void creation() throws CustomizeException{

        int data, select,n=0, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data to be store in linked list");
            data = sc.nextInt();
            Node new_node = new Node(data);
            /*Class object = new Class
            Allocating memory to a new node and
            putting in the data */
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("Enter 1 to insert data at the begining ");
                System.out.println("Enter 2 to insert data at the end ");
                System.out.println("Enter 3 to insert data at desired position ");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp=head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        traverse();
                        System.out.println("\n");
                        Node temp1=head;
                        System.out.println("\nEnter the position at which node is to be inserted");
                        p = sc.nextInt();
                        for (int i=1;i<(p-1);i++) {
                            if(temp1==null){
                                System.out.println(" null");}
                            else{
                                temp1 = temp1.next;}
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                    default:
                        System.out.println("invalid input");
                }
            }System.out.println("Do you want to add more data if yes then type 1 if no then enter 2");
            n = sc.nextInt();
            try {
                Integer check = parseInt(valueOf(n));
                if (check==1) System.out.println("  not null input");
                else if(check!=1&check>2) {
                    throw new CustomizeException("invalid input");
                }
            }catch (CustomizeException e){
                System.out.println("Enter 2  to exit  and 1 to enter data ");
            }
        }while (n==1);

    }

    public void traverse(){
        //creating a temp node pointing to head
        Node temp=head;
        if (head==null){
            System.out.println("Linked list does not exist");
        }else {
            System.out.print("current Linked list ");
            while (temp!=null){
                System.out.print("    "+temp.data+"  ");
                temp=temp.next;
            }
        }
    }
    public void deletion(){
        Node tempo=head;
        int n=0,choice;
        Scanner input=new Scanner(System.in);
        do{
            if (head==null) {
                System.out.println("\nlinked list does not exist");
            }else {
                System.out.println("\nThis is a deletion method  to delete any node");
                System.out.println("Enter 1 to delete from begining");
                System.out.println("Enter 2 to delete from end");
                System.out.println("Enter 3 to delete from desired position");
                int select=input.nextInt();
                switch (select){
                    case 1:
                        tempo=tempo.next;
                        head=tempo;
                        System.out.println("\nDeleted successfully\n");
                        break;
                    case 2:
                        Node temporary=head;//this is wiil be the previous node(just behind the ptr) during traversing the linked list
                        Node ptr=temporary.next;//this is the node pointing to next node address
                        while (ptr.next!=null){
                            temporary=ptr;
                            ptr=ptr.next;
                        }
                        temporary.next=null;
                        break;
                    case 3:
                        int p=0;
                        System.out.println("Enter position");
                        p=input.nextInt();
                        Node current_node=head;
                        Node previous_node=current_node.next;
                        for(int i=0;i<p-2;i++){
                            current_node=previous_node;
                            previous_node=previous_node.next;
                        }
                        current_node.next=previous_node.next;
                        break;
                    default:
                        System.out.println("Enter proper choice for deletion");
                        break;
                }
            }traverse();
            System.out.println("\nDo you want to delete more element, yes then type 1 or press 2 to exit");
            choice = input.nextInt();
        }while (n==1);
    }
    public static void main (String[]args) throws CustomizeException {

        LinkedListProgram ll = new LinkedListProgram();
        ll.creation();
        //creating new node in begining
        ll.traverse();
        ll.deletion();//delete element from begining

    }
}



