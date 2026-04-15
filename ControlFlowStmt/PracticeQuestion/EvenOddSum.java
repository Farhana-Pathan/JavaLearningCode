package Core.ControlFlowStmt.PracticeQuestion;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let us find the sum of even and odd numbers from 1 to n");
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        for (int i= 1; i<=n; i++){
            if (i % 2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + evenSum);
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + oddSum);

        sc.close();
    }
}
