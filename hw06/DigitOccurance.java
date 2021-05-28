package hw06;
import java.util.Scanner;
public class DigitOccurance {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();

        //dsiplay results
        String answer = "";
        for (int i = 0; i < count(s).length; i++) {
            if (count(s)[i] > 1){
                answer += "Digit " + (char)('0' + i) + " occurs " 
                + count(s)[i] + " times\n";
            }
            else if (count(s)[i] == 1){
                answer += "Digit " + (char)('0' + i) + " occurs " 
                + count(s)[i] + " time\n";
            }
        }
        System.out.print(answer);
        input.close();
    }

    //method to count the number of accurances in a string
    public static int[] count(String s) {
        int[] counts = new int[10];

        for (int i = 0; i < s.length(); i++){
            if (isDigit(s.charAt(i))) {
                if (s.charAt(i) == '0') counts[0]++; 
                if (s.charAt(i) == '1') counts[1]++; 
                if (s.charAt(i) == '2') counts[2]++; 
                if (s.charAt(i) == '3') counts[3]++; 
                if (s.charAt(i) == '4') counts[4]++; 
                if (s.charAt(i) == '5') counts[5]++; 
                if (s.charAt(i) == '6') counts[6]++; 
                if (s.charAt(i) == '7') counts[7]++; 
                if (s.charAt(i) == '8') counts[8]++; 
                if (s.charAt(i) == '9') counts[9]++; 
            }
        }       
        return counts; 
    }

    //method to check if a character in a string is a digit
    public static boolean isDigit(Character s) {
        if (s == '0' || s == '1' || s == '2' || s == '3' || s == '4' || s == '5' || s == '6' || s == '7' || s == '8' || s == '9'){
            return true;
        }
        return false;
    }

}