package Core.Functions.PracticeQuestions;

public class CheckEven {
    
    public static boolean isEven(int n){

        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
}
