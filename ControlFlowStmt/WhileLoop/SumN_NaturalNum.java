package Core.ControlFlowStmt.WhileLoop;

import java.util.Scanner;

public class SumN_NaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int sum = 0, i = 1;
        while (i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        input.close();
    }
}