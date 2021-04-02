package hw05;

//import Scanner
import java.util.Scanner;

//
import java.util.Arrays;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        input.close();

        System.out.print("Answer is " + conversion(integer));
    }



    //a method for decimal to binary conversion
    public static int conversion (int value) {
        int count = 0;
        while (value < 0) {
            if (value % 2 == 0){
                int quotient = value / 2;
                System.out.print(quotient);
            }
            count++;
            
        }
        return quotient;
    }

}
