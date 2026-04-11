package Core.ControlFlowStmt.WhileLoop;

public class ReverseOfNum {
    public static void main(String[] args) {
        int num = 12345;
        // int reverse = 0;
        while(num > 0) {
            int digit = num % 10;
            num /= 10;
            System.out.print(digit);   
        }
        System.out.println(num);

        // while(num > 0) {
        //     int digit = num % 10;
        //     num /= 10;
        //     reverse = reverse * 10 + digit;
        //     System.out.print(reverse);   
        // }
    }
}
