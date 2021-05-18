package hw07;

//Importing a scanner
import java.util.Scanner;

public class AreaOfTriange {
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        Scanner input = new Scanner(System.in);
        //read the three points
        double point1X = input.nextDouble();
        double point1Y = input.nextDouble();
        double point2X = input.nextDouble();
        double point2Y = input.nextDouble();
        double point3X = input.nextDouble();
        double point3Y = input.nextDouble();
        input.close();
        //get intersection point
        double theArea = getTriangleArea(point1X, point1Y, point2X, point2Y, point3X, point3Y);
        double slope1 = (point2Y - point1Y) / (point2X - point1X);
        double slope2 = (point3Y - point2Y) / (point3X - point2X);
        if (slope1 == slope2) {
            System.out.println("The three points are on the same line");
        }
        else {
            System.out.println("The area of the triangle is " + theArea);
        }
}

// JA: This was supposed to take Point objects as arguments
public static double getTriangleArea(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y){
    double area;
    double constant = 2.0;
    area = (Math.abs( p1x*(p2y - p3y) + p2x*(p3y- p1y) + p3x*(p1y - p2y) )/constant); 
    return area;
}

}
