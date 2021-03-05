package hw01;
/* This program computes the discriminant of a quadratical equation
    The user inputs the appropriate information and this program takes the 
    the info to compute the discriminant of the equation.
*/

import java.util.Scanner; //Explicit import

public class ComputeDiscriminant {

    /* main method*/
    public static void main(String[] orgs) {

        // getting the coefficients of the quadratic equation from the user
        System.out.println("Write your quadratic equation in this form ax2 + bx + c = 0");
        System.out.print("Enter your a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.print("Enter your b: ");
        int b = input.nextInt();

        System.out.print("Enter your c: ");
        int c = input.nextInt();
        
        // Calculating the discriminant
        int discriminant = ((b*b) - 4*a*c);

        //printing the result
        System.out.println("The discriminant of the equation " + a + "x2 + " + b + "x + " + c + " = 0 is: " + discriminant);
        System.out.println("The program ends here");

    }
    
}
