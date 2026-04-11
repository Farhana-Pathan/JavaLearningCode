//Variables and Data Types

package Core.DataTypes;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Three numbers: ");

        //Q1
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        double average = (num1 + num2 + num3) / 3.0; // Use 3.0 to ensure the result is a double
        System.out.println("The average is: " + average);

        //Q2
        int Area_S =num1 * num1;
        System.out.println("The area of the square is: " + Area_S); 

        //Q3
        System.out.println("Enter the cost of Pencil, Pen, and Eraser: ");
        float pencilCost = input.nextFloat();
        float penCost = input.nextFloat();
        float eraserCost = input.nextFloat();
        float totalCost = pencilCost + penCost + eraserCost;
        System.out.println("The total cost is: " + totalCost);
        
        input.close();
        int $ = 100;
        System.out.println("The value of $ is: " + $);  

        byte b = 127;
        char c = 'A';
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.141592653589793;

        System.out.println("The result of the expression is: " + ((f*b)+(i%c)-(d*s)+(l/f)));
    }
}
