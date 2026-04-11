package Core.ControlFlowStmt.DoWhileLoop;

import java.util.Scanner;

//Keep asking the user to enter a number until they enter a multiple of 10. Once they enter a multiple of 10, print the number and exit the loop.
public class EnterMulof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
        } while (true);
        System.out.println("You entered: " + num);
        sc.close();
    }
}
