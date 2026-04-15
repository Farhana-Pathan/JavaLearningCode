package Core.Functions;

public class FactorialFunc {

    public static int Factorial(int num){
        int n = num;
        int fact =1 ;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}
