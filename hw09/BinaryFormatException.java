import java.util.Scanner;

public class BinaryFormatException{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String stringFromUSer = input.nextLine();
        input.close();
        System.out.println(bin2Dec(stringFromUSer));
    }

    public static int bin2Dec(String binaryStrings) throws NumberFormatException {    
        if (!isABinaryNumber(binaryStrings)) {
            throw NumberFormatException (binaryStrings + "is a non-binary number");
        }
        
        int powerAtPosition = 0;
        int decimalNumber = 0;

        //create a back loop because of the powers, increasing from 0
        for (int i = binaryStrings.length() - 1; i >= 0; i--){
            if (binaryStrings.charAt(i) == '1') {
                decimalNumber += Math.pow(2, powerAtPosition);
            }
            powerAtPosition++;
        }
        return decimalNumber;
    }
    
    public static boolean isABinaryNumber (String binaryStrings) {
        for (char ch: binaryStrings.toCharArray()){
            if (ch != '1' && ch != '0') 
            return false;
        }
        return true;
    }

}

