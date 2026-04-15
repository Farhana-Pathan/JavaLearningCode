package Core.ControlFlowStmt.PracticeQuestion;
import java.util.Scanner;

//Prime numbers are the number that comes in the table of 1 or itself 
public class primeornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = input.nextInt();

        // boolean isprime = true;

        //Code without optimization
        // if(n==2){
        //     System.out.println("n is Prime");
        // }else{
            
        //     for(int i=2; i<=n-1; i++){
        //     if(n%i==0){//n comes in onther numbers table too

        //         isprime = false;
        //     }
        
        // }
        
        // if(isprime == true){
        //     System.out.println("n is Prime ");
        // }else{
        //     System.out.println("not Prime");
        // }
        // }
        input.close();

        //Optimized code
        if(n==2){
            System.out.println("n is Prime");
            return;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    System.out.println("not Prime");
                    return;
                    }
                }
                System.out.println("Prime");
            }
        }

    }
    

