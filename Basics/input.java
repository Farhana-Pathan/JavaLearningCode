package Core.Basics;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("are YOu a student? (true/false)");
        boolean isStudent = input.nextBoolean();
        System.out.print("You are a student: " + isStudent);
        input.close();
    }
}
