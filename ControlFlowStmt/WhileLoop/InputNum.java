//Input 10 numbers from user and find their sum using while loop
package Core.ControlFlowStmt.WhileLoop;

import java.util.Scanner;

public class InputNum {
    public static void main(String[] args) {
        
        int n = 1, num , sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        while (n <= 10) {
            n++;
            num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum of 10 numbers is: " + sum);
        input.close();
        

    }
}
