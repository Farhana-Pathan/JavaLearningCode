package Core.ControlFlowStmt.WhileLoop;

public class PrintNum {
    public static void main(String[] args) {
        int n =1;
        while(n <=10) {
            System.out.println(n);
            n++;
        }
        System.out.println(
            "The numbers from 1 to 10 have been printed successfully!"
        );
    }
}
