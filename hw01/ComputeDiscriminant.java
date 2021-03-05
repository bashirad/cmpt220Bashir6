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
        System.out.print("Enter your a: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        System.out.print("Enter your b: ");
        double b = input.nextDouble();

        System.out.print("Enter your c: ");
        double c = input.nextDouble();

    }
    
}
