package Core.ControlFlowStmt.ForLoop;

import java.util.Scanner;

public class ReverseOfNumSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        // input.close();
        // for(int i= num; i>=1; i--){
        //     System.out.println(i);

        int reverse = 0;
        for(int i = num; i > 0; i = i/10){
            int lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;
        }

    }
}
