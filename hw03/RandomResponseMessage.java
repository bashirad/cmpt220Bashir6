//package hw03;

import java.util.Scanner; 
import java.util.Arrays; 
import java.util.List; 

public class RandomResponseMessage {
  public static void main(String[] args) {
    // 1. Generate two random single-digit integers
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    // 2. If number1 < number2, swap number1 with number2
    if (number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    // 3. Prompt the student to answer "what is number1 – number2?"
    System.out.print
      ("What is " + number1 + " - " + number2 + "? ");
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    input.close();
    //generate a random number between 0 and 2
    double randomNumber = (int)(Math.random()*3);

    // 4. Grade the answer and display the result
    if (number1 - number2 == answer && randomNumber == 0.0)
      System.out.println("excellent");
    else if (number1 - number2 == answer && randomNumber == 1.0)
      System.out.println("correct");
    else if (number1 - number2 == answer && randomNumber == 2.0)
      System.out.println("way to go");
    else {
      if (randomNumber == 0.0)
      System.out.println("incorrect");
      if (randomNumber == 1.0)
      System.out.println("wrong");
      if (randomNumber == 2.0)
      System.out.println("not right");
      System.out.println(number1 + " - " + number2 + 
        " should be " + (number1 - number2)); 
    }
  }
}