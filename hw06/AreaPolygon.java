package hw06;

//importing scanner
import java.util.Scanner;

public class AreaPolygon {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompting the user to enter x coordinates of the 6 points
        System.out.print("Enter the 6 xcoordinates, separated by space: ");
        int [] xcoordinates = new int [6];
        for (int i = 0; i < 6; i++){
            xcoordinates[i] = input.nextInt();
        }
        System.out.print("Enter the 6 ycoordinates, separated by space: ");
        int [] ycoordinates = new int [6];
        for (int i = 0; i < 6; i++){
            ycoordinates[i] = input.nextInt();
        }
        input.close();

        //Display results
        System.out.print("The area of the polygon is: " + getPolygonArea(xcoordinates, ycoordinates));
    }
//method to calculate area of a polygon
public static int getPolygonArea(int [] x, int [] y) {
    int area = 0;
    int k = 5;
    
    for (int i = 0; i < 6; i++){
        area += x[k] + x[i] * (y[k] + y[i]);
        //k and i are adjacent vertices, where k comes before i
        k = i;
    }
    return area/2;
}

}