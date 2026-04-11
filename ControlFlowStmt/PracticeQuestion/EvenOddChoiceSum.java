package Core.ControlFlowStmt;

import java.util.Scanner;

public class EvenOddChoiceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int choice;
        int n;

        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n % 2 == 0){
                evenSum += n;
            }else{
                oddSum += n;
            };
            System.out.println("Do you want to continue? (1 for yes, 0 for no): ");
            choice = sc.nextInt();
            if (choice == 0){
                break;
            }
        }while (true);
        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.println("Sum of odd numbers is: " + oddSum);  
        sc.close();
    }
}
