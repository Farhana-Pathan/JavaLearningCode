package Core.Functions;

public class BinomialCoeffFunc {

    public static int Factorial(int num){ //Helper Function
        int n = num;
        int fact =1 ;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int BinomialCoeff(int n, int r){
        
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int n_rfact = Factorial(n-r);

        int Coeff = n_fact/(r_fact*(n_rfact));
        return Coeff; 

    }

    public static void main(String[] args) {
        System.out.println(BinomialCoeff(5, 2));
    }
}
