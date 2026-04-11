package Core.ConditionalStmt;
import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        double result;
        input.close();
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
                case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
                case '*':
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                break;
                case '/':
                    result = (double) num1 / num2;
                    System.out.println("The result is: " + result);
                break;
        }

    }
}
