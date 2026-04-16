package Core.Functions.PracticeQuestions;

// Write a Java method to compute the averageof three numbers

public class AvgOfNums {
    
    public static int CalcAvg(int a, int b, int c){
        int avg = (a + b + c)/3;
        return avg; 
    }

    public static void main(String[] args) {
        System.out.println(CalcAvg(3, 4, 5));
    }
}
