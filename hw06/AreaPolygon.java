package hw06;

//importing scanner
import java.util.Scanner;

public class AreaPolygon {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompting the user to enter x coordinates of the 6 points
        System.out.print("Enter the 6 points, as x and y separated by space: ");
        int [] points = new int [12];
        for (int i = 0; i < 13; i++){
            points[i] = input.nextInt();
        }
        input.close();

        //calculate the sidelengths for all triangles
        int sidelengthOneddd = getsideLength(points[2], points[0], points[3], points[1]);
        int sidelengthTwoeee = getsideLength(points[4], points[2], points[5], points[3]);
        int sidelengthThreefff = getsideLength(points[4], points[0], points[5], points[1]);
        int sidelengthFourggg = getsideLength(points[6], points[4], points[7], points[5]);
        int sidelengthFiveiii = getsideLength(points[6], points[0], points[7], points[1]);
        int sidelengthSixjjj = getsideLength(points[8], points[6], points[9], points[7]);
        int sidelengthSevenkkk = getsideLength(points[8], points[0], points[9], points[1]);
        int sidelengthEightlll = getsideLength(points[10], points[8], points[11], points[9]);
        int sidelengthNinemmm = getsideLength(points[10], points[0], points[11], points[1]);

        //calculate the half of the perimeter of 4 triangles
        int triangleOneHalfPerimeter = gethalfPerimeter(sidelengthOneddd, sidelengthTwoeee, sidelengthThreefff);
        int triangleTwoHalfPerimeter = gethalfPerimeter(sidelengthThreefff, sidelengthFourggg, sidelengthFiveiii);
        int triangleThreeHalfPerimeter = gethalfPerimeter(sidelengthFiveiii, sidelengthSixjjj, sidelengthSevenkkk);
        int triangleFourHalfPerimeter = gethalfPerimeter(sidelengthSevenkkk, sidelengthEightlll, sidelengthNinemmm);

        //calculate the area of the 4 triangles
        int triangleOneArea = getTriangleArea(triangleOneHalfPerimeter, sidelengthOneddd, sidelengthTwoeee, sidelengthThreefff);
        int triangleTwoArea = getTriangleArea(triangleTwoHalfPerimeter, sidelengthThreefff, sidelengthFourggg, sidelengthFiveiii);
        int triangleThreeArea = getTriangleArea(triangleThreeHalfPerimeter, sidelengthFiveiii, sidelengthSixjjj, sidelengthSevenkkk);
        int triangleFourArea = getTriangleArea(triangleFourHalfPerimeter, sidelengthSevenkkk, sidelengthEightlll, sidelengthNinemmm);

        //calculate the area of the polygon
        int polygonArea = getPolygonArea(triangleOneArea, triangleTwoArea, triangleThreeArea, triangleFourArea);

        //Display the result
        displayResults(polygonArea);
        }

        //method to calculate the length of a side of a triangle
        public static int getsideLength(int s, int u, int v, int w){
            int length = (int)Math.sqrt(Math.pow((s - u), 2) - Math.pow((v - w), 2));
            return length;
        }

        //method to calculate half of the perimeter of a triangle
        public static int gethalfPerimeter(int a, int b, int c) {
            int perimeter = a + b + c;
            return perimeter;
        }

        //method to calculate area of a triangle
        public static int getTriangleArea(int p, int a, int b, int c) {
            int area = (int)Math.sqrt(p * (p - a) * (p - b) * (p - c));  
            return area;
        }

        //method to calculate the area of a polygon
        public static int getPolygonArea(int a, int b, int c, int d) {
            int area = a + b + c + d;
            return area;
        }

        //method to display the results
        public static void displayResults(int a){
            System.out.println("The area of the polygon is: " + a);
        }
}