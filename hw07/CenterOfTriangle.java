//Importing a scanner
import java.util.Scanner;

public class CenterOfTriangle {
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        Scanner input = new Scanner(System.in);
        //read the three points
        Points point1 = new Points(input.nextDouble(), input.nextDouble());
        Points point2 = new Points(input.nextDouble(), input.nextDouble());
        Points point3 = new Points(input.nextDouble(), input.nextDouble());
        input.close();
        //get center point
        Points center = Points.getCenterPoint(point1, point2, point3);
        System.out.println("The Center point is at (" + center.getX() + ", " + center.getY() + ")");
    }
}

class Points {
    private double x;
    private double y;
    //construct a point with a specific x and y
    public Points(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public static Points getCenterPoint(Points p1, Points p2, Points p3){
        double centerX;
        double centerY;
        Points centre;
        centerX = (( (p1.getX()) + (p2.getX()) + (p3.getX()) )/3);
        centerY = (( (p1.getY()) + (p2.getY()) + (p3.getY()) )/3); 
        centre =  new Points(centerX, centerY);
        return centre;
        
    }
}

