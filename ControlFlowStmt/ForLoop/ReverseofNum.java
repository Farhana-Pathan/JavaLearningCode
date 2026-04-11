package Core.ControlFlowStmt.ForLoop;

public class ReverseofNum {
    public static void main(String[] args) {
        int n = 12345;
        int reverse = 0;

        for (int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("The reverse of the number is: " + reverse);
        System.out.println("The original number is: " + n);
    }
}