package Core.Functions.PracticeQuestions;



public class Countdigits {

    public static int countdgt(int n){
        // int myInt = n;

        int count = 0;
        for(int i = n; i > 0; i = i/10){
            count++;
        }return count;
    }


    public static void main(String[] args) {
        System.out.println(countdgt(14627678));
    }
    
}
