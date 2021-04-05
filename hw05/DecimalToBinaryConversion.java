//package hw05;

//import Scanner
import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        input.close();

        System.out.print("Answer is " + decimalToBinary(integer));
    }



    //a method for decimal to binary conversion
    public static String decimalToBinary (int value) {
        String result = "";
        String backwardOrder = "";
        while (value > 0) {
            if (value % 2 == 0){
                result += "0";
                value = value / 2;
            }
            else {
                result += "1";
                value = value / 2;
            }
        }
        for(int i = result.length() - 1; i >= 0; i--)
        {
        backwardOrder += result.charAt(i);
        }
        return backwardOrder;
    }

}
