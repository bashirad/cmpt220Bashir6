//Importing a scanner
import java.util.Scanner;

public class AreaOfTriange {
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        Scanner input = new Scanner(System.in);
        //read the four points
        Points point1 = new Points(input.nextDouble(), input.nextDouble());
        Points point2 = new Points(input.nextDouble(), input.nextDouble());
        Points point3 = new Points(input.nextDouble(), input.nextDouble());
        input.close();
        //get intersection point
        Points intersect = Points.getCenterPoint(point1, point2, point3);
    }
    
}
