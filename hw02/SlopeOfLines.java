//package hw02;

//impoting Scanner
import java.util.Scanner;

public class SlopeOfLines {
    public static void main(String[] args) {

         //Creating a Scanner
    Scanner input = new Scanner(System.in);

        //prompting user to enter the coordinates of two points
    System.out.print("Enter the coordinates of two points: ");
    double firstX = input.nextDouble();
    double firstY = input.nextDouble();
    double secondX = input.nextDouble();
    double secondY = input.nextDouble();

        //stop scanning = no more input to read
    input.close();

        // calculate the slope
    double slope = (secondY - firstY) / (secondX - firstX);

        //display results
    System.out.println("the slope for the line that connects two points (" + firstX + ", " + firstY + " ) and ( " + secondX + ", " + secondY + " ) is " + (int)(slope * 100000) / 100000.0);
    }

    
}
