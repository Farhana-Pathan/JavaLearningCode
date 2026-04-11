package Core.ControlFlowStmt;
import java.util.Scanner;

public class ContinueQuestion{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // for (;;){
        //     System.out.println("Enter a number: ");
        //     int num;
        //     if ( num % 10 == 0){
        //         num = sc.nextInt();
        //         continue;
        //     }

        // }

        while (true){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num % 10 == 0){
                break;
            }            
        }
        sc.close();
    }
}