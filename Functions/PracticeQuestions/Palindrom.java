package Core.Functions.PracticeQuestions;

public class Palindrom {

    public static int isReverse(int n){
        int reverse = 0;
        for(int i = n; i > 0; i= i/10){
            int lastdgt = i%10;
            reverse = (reverse* 10) + lastdgt;
        }
        return reverse;
    }
    
    public static void isPlindrom(int n){
        if(n==isReverse(n)){
            System.out.println("The give number is plindromic Number");
        }else{
            System.out.println("Number is not Plindromic");
        }
    }

    public static void main(String[] args) {
        isPlindrom(121);
        isPlindrom(356);
    }
}
