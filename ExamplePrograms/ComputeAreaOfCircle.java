package ExamplePrograms;
import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAreaOfCircle {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    input.close();
    // Prompt the user to enter a radius
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();

    // Compute area
    double area = radius * radius * 3.14159;

    // Display result
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  } 
  
}