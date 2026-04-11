package Core.Basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators 
        // (Binary) Addition, Subtraction, Multiplication, Division, Modulus
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // (Unary) Increment and Decrement Operators
        a++; // a becomes 11
        b--; // b becomes 4
        System.out.println("After Increment, a: " + a); // 11
        System.out.println("After Decrement, b: " + b); // 4
        
        //Pre and Post Increment/Decrement
        int c = 5;
        System.out.println("Post Increment: " + (c++)); // 5, then
        System.out.println("Current value of c: " + c); // 6
        int d = 5;
        System.out.println("Pre Increment: " + (++d)); // 6, then   

        // Relational Operators
        System.out.println("Is a greater than b? " + (a > b)); // true
        System.out.println("Is a less than b? " + (a < b)); // false
        System.out.println("Is a equal to b? " + (a == b)); // false

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false
    }
}
