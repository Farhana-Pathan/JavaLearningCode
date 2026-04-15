package Core.Functions;

public class PrintPrimeRange {
    
    public static boolean PrimeorNot(int n) {
        
        if(n<=1){
            return false;
        }

        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrintRange(int n){


        for(int i = 1; i<= n; i++){
            if(PrimeorNot(i) ==true){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        PrintRange(10);
    }
}
