package Core.Functions;

public class PrimeOrNot {

    public static void isPrime(int n){

        boolean isPrimeNum = true;
        if(n <= 1){
            System.out.println("Number is not Prime");
        }else{
            for(int i= 2; i <= n-1; i++){
                
                if(n %i ==0){
                    isPrimeNum = false;
                    break;
                }
            }
        }
        if(isPrimeNum == true){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
    
    public static void main(String[] args) {
        isPrime(5);
    }

}
