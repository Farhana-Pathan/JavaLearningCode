package Core.Functions;

public class SwapingFunction{

    public static void Swap(int a, int b){

        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public static void main(String[] args) {
        
        int a = 5;
        int b = 7;
        
        Swap(a, b);
    }
}