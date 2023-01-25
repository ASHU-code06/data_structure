package nonprimarydatastucture;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        QueueUsingLinkedList ll = new QueueUsingLinkedList();
        int choice,loopvar = 0;
        Scanner var = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to Enqueue");
            System.out.println("Enter 2 to dislay");
            System.out.println("Enter your choice");
            choice=var.nextInt();
            switch (choice){
                case 1:
                    ll.enqueue(var);
                    break;
                case 2:
                    ll.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }System.out.println("Enter 3 to go back to main menu OR enter 4 to exit");
            loopvar=var.nextInt();
        } while (loopvar == 3);
        System.out.println("Exit successfully");
    }
}
