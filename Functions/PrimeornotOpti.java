package Core.Functions;

public class PrimeornotOpti {
    
    public static void PrimeOrNOT(int n){
    
    boolean isPrime = true;
        if(n<=1){
            System.out.println("N is Neither Prime nor Composite ");
        }
        else{
            for(int i = 1; i <=Math.sqrt(n); i++){
                if(n%2==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime==true){
            System.out.println("N is a Prime");
        }else{
            System.out.println("N is not Prime");
        }

    }

    public static void main(String[] args) {
        PrimeOrNOT(6);
    }

}
