package nonprimarydatastucture;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        queue ll = new queue();
        int choice, loopvar = 0;
        Scanner var = new Scanner(System.in);
        do {
            System.out.println("Type 1 to enqueue");
            System.out.println("Type 2 to dequeue");
            System.out.println("Type 3 to display");
            System.out.println("Enter your choice");
            choice=var.nextInt();
            switch (choice){
                case 1:
                    ll.enqueue(var);
                    break;
                case 1:
                    ll.dequeue();
                    break;
                case 1:
                    ll.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Enter 1 to go back to main menu OR  enter 0 to exit ");
            loopvar=var.nextInt();
        } while (loopvar == 1);
        System.out.println("Exit Successfully");



    }
}
