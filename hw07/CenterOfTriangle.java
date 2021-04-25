//Importing a scanner
import java.util.Scanner;

public class CenterOfTriangle {
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        Scanner input = new Scanner(System.in);
        //read the three points
        Point point1 = new Point(input.nextDouble(), input.nextDouble());
        Point point2 = new Point(input.nextDouble(), input.nextDouble());
        Point point3 = new Point(input.nextDouble(), input.nextDouble());
        input.close();
        //get center point
        Point center = getCenterPoint(point1, point2, point3);
        System.out.println("The Center point is at (" + center.getX() + ", " + center.getY() + ")");
    }

    public static Point getCenterPoint(Point p1, Point p2, Point p3){
        double centerX;
        double centerY;
        Point centre;
        centerX = (( (p1.getX()) + (p2.getX()) + (p3.getX()) )/3);
        centerY = (( (p1.getY()) + (p2.getY()) + (p3.getY()) )/3); 
        centre =  new Point(centerX, centerY);
        return centre;
        
    }   
}


