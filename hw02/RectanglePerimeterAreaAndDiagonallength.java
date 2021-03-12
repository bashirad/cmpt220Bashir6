package hw02;

import java.util.Scanner; //importing Scanner
import static java.lang.Math.*;

public class RectanglePerimeterAreaAndDiagonallength {
    public static void main(String[] orgs) {
        

            // Create a Scanner object
        Scanner input = new Scanner(System.in);
  
            // Prompt the user to enter the width and height of the rectangle
        System.out.print("Enter the width and height of a rectangle: ");
        double width = input.nextDouble();
        double height = input.nextDouble();
        input.close();

            //calculating the perimeter
        double perimeter = 2 * (width + height);

            //calculating the area
        double area = width * height;

            //calculating the diagnol length
        double diagnolLength = sqrt( (Math.pow(width, 2)) + (Math.pow(height, 2)));
        
        
            //print results
        System.out.println("The perimeter is " + (int)(perimeter * 100) / 100.0);
        System.out.println("The area is " + (int)(area * 1000) / 1000.0);
        System.out.println("The length of the diagonal is " + diagnolLength);

        
        
    }
    
}
