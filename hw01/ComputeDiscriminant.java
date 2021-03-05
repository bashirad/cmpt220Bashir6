package hw01;
/* This program computes the discriminant of the following quadratical equation 3x
2 + 4x + 5 = 0
*/



public class ComputeDiscriminant {

    /* main method*/
    public static void main(String[] orgs) {

        // getting the coefficients of the quadratic equation
        int a = 3;
        int b = 4;
        int c = 5;

        // Calculating the discriminant
        int discriminant = ((b*b) - 4*a*c);

        //printing the result
        System.out.println("The discriminant of the quadratical equation 3x2 + 4x + 5 = 0 is: " + discriminant);
        System.out.println("The program ends here");

    }
    
}
