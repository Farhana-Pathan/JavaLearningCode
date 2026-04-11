package Core.ConditionalStmt;
import java.util.Scanner;
public class ToCheckNumType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        if (num > 0){
            System.out.println("The Number is Positive");
        } else if (num < 0) {
            System.out.println("The Number is Negative");
        } else {
            System.out.println("The Number is Zero");
        }
    }
}
