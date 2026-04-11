//Conditionals Statements in Java

package Core.ConditionalStmt; 
public class IFElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // If-Else Statement
        // Check if a is greater than, less than, or equal to b
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }
        // Check if a is even or odd
        if(a % 2 == 0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }

        //Else-If Ladder
        // Check if a is positive, negative, or zero
        if (a > 0) {   
            System.out.println("a is positive");
        } else if (a < 0) {
            System.out.println("a is negative");
        } else {
            System.out.println("a is zero");
        }   

        //Income Tax Calculation using Else-If Ladder
        double income = 45000;
        double tax;
        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.1;
        } else if (income <= 60000) {
            tax = 2000 + (income - 30000) * 0.2;
        } else {
            tax = 8000 + (income - 60000) * 0.3;
        }
        System.out.println("Income Tax: " + tax);

        // Nested If-Else Statement
        int age = 25;
        if (age >= 18) {
            if (age < 60) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a senior citizen.");
            }
        } else {
            System.out.println("You are a minor.");
        }

        //Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("The maximum of a and b is: " + max);

        // Switch Statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}