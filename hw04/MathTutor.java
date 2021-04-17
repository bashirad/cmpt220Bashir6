//package hw04;

//importing a scanner
import java.util.Scanner; 

public class MathTutor {
    public static void main(String[] args) {

        // Display the menu
        choicePrint("Main menu");
        choicePrint("1: Addition");
        choicePrint("2: Subtraction");
        choicePrint("3: Multiplication");
        choicePrint("4: Division");
        choicePrint("5: Exit");

        //creating a scanner
        Scanner input = new Scanner(System.in);

        //prompting the user to choose a math operation
        System.out.print("Enter a choice: ");
        int choice = input.nextInt();

        //Random numbers
        int randomNumber1 = ((int)(Math.random() * 10)); 
        int randomNumber2 = ((int)(Math.random() * 10));

        //choose an operation
        if (choice == 1) {
            System.out.print("What is " + randomNumber1 + " + " + randomNumber2 + "? "); 
            int actualAnswer = additionTest(randomNumber1, randomNumber2);
            int userAnswer = input.nextInt();

            //evaluate the answer
            evaluateAnswer(userAnswer, actualAnswer);    
        }

        else if (choice == 2) {
            System.out.print("What is " + randomNumber1 + " - " + randomNumber2 + "? "); 
            int actualAnswer = subtractionTest(randomNumber1, randomNumber2);
            int userAnswer = input.nextInt();
            
            //evaluate the answer
            evaluateAnswer(userAnswer, actualAnswer);    
        }

        else if (choice == 3) {
            System.out.print("What is " + randomNumber1 + " * " + randomNumber2 + "? "); 
            int actualAnswer = multiplicationTest(randomNumber1, randomNumber2);
            int userAnswer = input.nextInt();
            
            //evaluate the answer
            evaluateAnswer(userAnswer, actualAnswer);    
        }

        else if (choice == 4) {
            System.out.print("What is " + randomNumber1 + " / " + randomNumber2 + "? "); 
            int actualAnswer = divisionTest(randomNumber1, randomNumber2);
            int userAnswer = input.nextInt();
            
            //evaluate the answer
            evaluateAnswer(userAnswer, actualAnswer);    
        }

        else {
            System.exit(0);
        }
        //stop scanning
        input.close();
    }
    //A Method for Displaying Text
    public static void choicePrint(String message) {
        System.out.println(message);
    }

    //Evaluate answer
    public static void evaluateAnswer(int ans1, int ans2){
        if (ans1 == ans2){
            System.out.print("Correct");
        }
        else {
            System.out.print("Your answer is wrong. The correct answer is " + ans2);
        }

    }

    //A Method for addition
    public static int additionTest(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    //A Method for Subtraction
    public static int subtractionTest(int num1, int num2) {
        if (num1 >= num2) {
            int difference = num1 - num2;
            return difference;
        }
        else {
            System.out.print("What is " + num2 + " - " + num1 + "?");
            int difference = num2 - num1;
            return difference;
        }

    }

    //A Method for Multiplication
    public static int multiplicationTest(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    //A Method for Division
    public static int divisionTest(int num1, int num2) {
        if (num2 == 0) {
            int qoutient = num2 / num1;
            return qoutient;
        }
        else {
            int qoutient = num1 / num2;
            return qoutient;
        }

    }

}
