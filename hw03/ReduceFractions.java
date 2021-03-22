//package hw03;

//importing Scanner
import java.util.Scanner; 

public class ReduceFractions {
    public static void main(String[] orgs){

        //create a Scanner
        Scanner input = new Scanner(System.in);

        //getting the numbers of the user
        System.out.print("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter a denominator: ");
        int denominator = input.nextInt();

        //stop scanning
        input.close();

        //decide if the fraction is a proper one
        if (numerator < denominator) {
            System.out.print(numerator + " / " + denominator + " is a proper fraction");
        }
        else if (numerator % denominator == 0) {
            System.out.print(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + numerator / denominator);
        }
        else {
            System.out.print(numerator + " / " + denominator + " is an improper fraction and its mixed fraction is " + (numerator/denominator) + " + " + (numerator % denominator) + " / " + denominator);
        }
    }
}
