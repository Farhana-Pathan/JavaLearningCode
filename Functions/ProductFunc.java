package Core.Functions;

public class ProductFunc {

    public static int Product(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int product = Product(a, b);
        System.out.println("Product is: "+ product);
        System.out.println("Product is: "+Product(a, b));
    }
}
