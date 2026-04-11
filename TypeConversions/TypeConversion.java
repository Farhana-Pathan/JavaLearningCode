package Core.TypeConversions;

public class TypeConversion {
    public static void main(String[] args) {
        int i = 100;
        double d = i; // Implicit conversion (widening)
        System.out.println("Integer value: " + i);
        System.out.println("Double value after implicit conversion: " + d);

        double d2 = 3.14;
        int i2 = (int) d2; // Explicit conversion (narrowing)
        System.out.println("Double value: " + d2);
        System.out.println("Integer value after explicit conversion: " + i2);

        char c = 'A';
        int asciiValue = c; // Implicit conversion (widening)
        System.out.println("Character: " + c);
        System.out.println("ASCII value: " + asciiValue);

        char a = 'a';
        char b = 'b';
        int sum =  b-a; // Implicit conversion (widening)
        System.out.println("Character a: " +(int) a);
        System.out.println("Character b: " +(int) b);
        System.out.println("Sum of ASCII values: " + sum);

    }
}
