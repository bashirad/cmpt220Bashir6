package hw06;
import java.util.Scanner;

public class DigitOccurance {
 public static void main(String[] args) {
  Scanner input= new Scanner(System.in);
  System.out.println("Enter a string");
  String s = input.next();

  int[] counts = countNumbers(s);

  String output = "";

  for (int i = 0; i < counts.length; i++) {
   if (counts[i] != 0)
                        {
           output += "Digit" + (char)('0' + i) + " occurs " +
           counts[i] + ((counts[i] == 1) + " times\n");
                        }

           }

                System.out.print(output);
           }


 public static int[] countNumbers(String s) {
  int[] counts = new int[10];

  for(int i = 0; i < s.length(); i++) {
   if (Character.isDigit(s.charAt(i)));
   counts[s.charAt(i) - '0']++;
  }
  return counts;
 }
 public static boolean isDigit(String s) {
    for(int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9'){
            return true;
        }
 }
 return false;
}
}