package hw06;

import java.util.Scanner;

public class MatricInverse {
    public static void main(String[] args) {
         //create a scanner
         Scanner input = new Scanner(System.in);

         //prompting the user to enter a 2x2 matrix 
         System.out.print("Enter a, b, c, d: ");
         double [][] userMatrix = new double [2][2];
         userMatrix [0][0] = input.nextDouble();
         userMatrix [0][1] = input.nextDouble();
         userMatrix [1][0] = input.nextDouble();
         userMatrix [1][1] = input.nextDouble();

         //display results
         if (inverse(userMatrix) == null) {
             System.out.println("No inverse matrix");
         }
         else {
             System.out.print(inverse(userMatrix));
         }
         input.close();
    }   

    //method to find the inverse of a 2x2 matrix if it exists
    public static double [][] inverse(double [][] A) {
        double coefficent = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
        double [][] B = new double [2][2];

        if(1.0 / coefficent == 0) {
            return null;
        }
        else {
            B[0][0] = coefficent * A[1][1];
            B[0][1] = -1 * (coefficent * A[0][1]);
            B[1][0] = -1 * coefficent * A[1][0];
            B[1][1] = coefficent * A[0][0];
        }
    return B;
    }
}