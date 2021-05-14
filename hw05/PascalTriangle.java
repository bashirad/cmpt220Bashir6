package hw05;

//import Scanner
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        input.close();

        for (int i = 1; i < rows; i++) {
            System.out.println(pascalTriangle(i));
        }

    }

    // method for pascal triangle
    public static int pascalTriangle(int numberOfRows) {
        int result = 0;
        System.out.printf("%7s", "1");
        for (int i = 1; i < numberOfRows; i++) {
            result = (factorial(numberOfRows)) / (factorial(i) * (factorial(numberOfRows - i)));
            System.out.printf("%7s", +result);
        }
        System.out.printf("%7s", "1");

        return result;
    }

    // factorial method
    public static int factorial(int num) {
        int result = 0;
        int factorials = 1;
        for (int i = 1; i <= num; i++) {
            factorials = factorials * i;
            result = factorials;
        }

        return result;
    }
}
