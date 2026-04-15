package Core.Functions;

public class MethodOverloading {

    // Method Overloadin using No of Parameters 
    
    //Function to Calc Sum of 2 No
    public static int sum(int a, int b){
        return a + b;
    }

    //Function to Calc Sum of 3 No
    public static int sum(int a, int b, int c){
        return a + b + c; 
    }

    // Method Overloadin using Data Types of Parameter

    //Function for addition of 2 float values 
    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {

        // Method Overloadin using No of Parameters 
        System.out.println(sum(7 , 8 ));
        System.out.println(sum(1, 2, 3));

        // Method Overloadin using Data Types of Parameter
        System.out.println(sum(5, 6));
        System.out.println(sum(5.2f, 3.5f));
    }   
}
