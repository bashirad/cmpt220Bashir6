//package hw02;
    //importing Scanner
import java.util.Scanner; 

public class OneDimensionalMotion {
    public static void main(String[] args) {

        // Create a Scanner
    Scanner input = new Scanner(System.in);

        //prompting the user to enter the travel time
    System.out.print("Enter the ball travel time in seconds: ");
    double time = input.nextDouble();
    input.close();

        // calculating the height of the building
    double height = (9.8 / 2) * (time * time);

        //print results
    System.out.println("The height of the building is " + (int)(height * 1000) / 1000.0);

    }
}
