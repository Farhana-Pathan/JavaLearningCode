package Core.ControlFlowStmt;
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        BigInteger fact = BigInteger.ONE;

        for (int i = n; i >= 1; i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}