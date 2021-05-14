package hw06;
//importing scanner
import java.util.Scanner;

public class AreaPolygon {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompting the user to enter x coordinates of the 6 points
        System.out.print("Enter the 6 x coordinates, as 6 numbers separated by spaces then hit Enter: ");
        int [] xCoordinates = new int [6];
        for (int i = 0; i < 6; i++){
            xCoordinates[i] = input.nextInt();
    }

        //prompting the user to enter y coordinates of the 6 points
        System.out.print("Enter the 6 y coordinates, as 6 numbers separated by spaces then hit Enter: ");
        int [] yCoordinates = new int [6];
        for (int j = 0; j < 6; j++){
            yCoordinates[j] = input.nextInt();
    } 

        //display the area
        System.out.println("The area of the polygon is: " + getPolygonArea(xCoordinates, yCoordinates)); 
        //closing the scanner
        input.close();
    }

    //method to calculate the area of a polygon
    public static int getPolygonArea(int [] x, int [] y) {
        int area = 0;
        //calculate area
        int k = 5;
        for (int i = 0; i < 6; i++){
            area += ((x[k] + x[i]) * (y[k] + y[i]))/2.0;
        }
        return area;
    }
    
}