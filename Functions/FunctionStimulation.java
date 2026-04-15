package Core.Functions;

import java.util.Scanner;


public class FunctionStimulation {

// Function with No Parameters PrintHelloWorld()
    public static void PrintHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    
//Function With Parameters SumFunction()
    public static int Sum(int num1, int num2){ //Parameters or Formal Parameters
        int sum = num1 + num2;
        return sum;
    }



    public static void main(String[] args) {
        PrintHelloWorld();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = Sum(a, b);//Arguments or Actual parameters
        System.out.println("sum is "+ sum);
        sc.close();

    }
}
