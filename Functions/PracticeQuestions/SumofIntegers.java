package Core.Functions.PracticeQuestions;

public class SumofIntegers {
    
    public static int sumofInts(int n){

        int sum = 0;
        for(int i = n; i >0; i= i/10){
            int lastdigit = i%10;
            sum = sum + lastdigit;
            System.out.println(n);
        }
        return sum;
        
    }

    public static void main(String[] args) {
        System.out.println(sumofInts(12345));
    }
}
