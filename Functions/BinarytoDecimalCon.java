package Core.Functions;

public class BinarytoDecimalCon {

    public static void convertToDecimal(int binum){

        int Mynum = binum;
        int pow = 0;
        int decNum = 0;
        
        while(binum > 0){
            int lastDigit = binum % 10;
            decNum = decNum + (lastDigit*(int)Math.pow(2, pow));

            pow++;
            binum = binum / 10;
        }

        System.out.println("Decimal of "+Mynum+ " = " +decNum );
    }

    public static void main(String[] args) {
        convertToDecimal(101);
    }
}
