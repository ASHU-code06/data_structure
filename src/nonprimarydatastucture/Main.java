package nonprimarydatastucture;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        StackUsingLinkedList ll = new StackUsingLinkedList();
        int loopvar = 0;
        Scanner var = new Scanner(System.in);
        do {
            System.out.println("Enter data ");
            ll.push(var);
            System.out.println("Enter 1 to push more data or enter 2 to exit");
            loopvar=var.nextInt();
        } while (loopvar == 1);
        System.out.println("Exit successfully");
        ll.display();
        System.out.println("Do you want to pop data? if yes type 3");
        int i = var.nextInt();
        while (i == 3) {
            ll.pop();
            System.out.println("Do you want to pop data? if yes type 3 else type 4 to exit");
            i = var.nextInt();
        }
        ll.display();
        System.out.println("Exit successfully");

    }
}
