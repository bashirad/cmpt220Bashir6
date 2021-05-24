package hw06;

import java.util.Scanner;

public class TestingDigits {
  /** Main method */
  public static void main(String[] args) {

    //create a scanner and then read the scanner for the user input
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();

    // Count the occurrences of each letter
    int[] counts = count(userInput);

    // Display counts
    System.out.println();
    System.out.println("The occurrences of each letter are:");
    displayCounts(counts);
  }

  /** Count the occurrences of each character */
  public static int[] count(String s) {

    // Declare and create an array
    char[] chars = new char[s.length()];
    
    // assign characters from user
    // to the array
    for (int i = 0; i < s.length(); i++) {
        chars[i] = s.charAt(i);
    }

    // Declare and create an array of 10 
    int[] counts = new int[10];

    // For each character in the array, count it
    for (int i = 0; i < chars.length; i++)
    
      counts[chars[i]]++;

    return counts;
  }

  /** Display counts */
  public static void displayCounts(int[] counts) {
    for (int i = 0; i < counts.length; i++) {
      if ((i + 1) % 10 == 0)
        System.out.println(counts[i] + " " + (char)(i + 'a'));
      else
        System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
    }
  }
}
