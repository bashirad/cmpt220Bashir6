
//Importing a scanner
import java.util.Scanner;




public class IntersectingPoint {
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        Scanner input = new Scanner(System.in);
        //read the four points
        Point point1 = new Point(input.nextDouble(), input.nextDouble());
        Point point2 = new Point(input.nextDouble(), input.nextDouble());
        Point point3 = new Point(input.nextDouble(), input.nextDouble());
        Point point4 = new Point(input.nextDouble(), input.nextDouble());
        input.close();

        //get intersection point
        Point intersect = Point.getIntersectingPoint(point1, point2, point3, point4);
        //check if there is a point and print the values if not print the lines are parallel
        if ( intersect == null) {
            System.out.println("The two lines are parallel");
        }
        else {
            System.out.println("The intersecting point is at (" + (int)(intersect.getX()*100000)/100000.0 + ", " + (int)(intersect.getY()*100000)/100000.0 + ")");
        }

        

    }

}

    class Point {
        private double x;
        private double y;
        //construct a point with a specific x and y
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
    

    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4){
        double intersectX;
        double intersectY;
        Point intersection;
        if (((p1.getY() -  p2.getY()) * (p3.getX() - p4.getX())) - ((p1.getX() - p2.getX()) * (p3.getY() - p4.getY())) == 0) {
            return null;
        }
        else {
            intersectX = ((((((p1.getY() - p2.getY()) * p1.getX()) - ((p1.getX() - p2.getX()) * p1.getY())) * (p3.getX() - p4.getX())) - ((p1.getX() - p2.getX()) *  ((((p3.getY() - p4.getY()) * p3.getX()) - ((p3.getX() - p4.getX()) * p3.getY()))))) / (((p1.getY() -  p2.getY()) * (p3.getX() - p4.getX())) - ((p1.getX() - p2.getX()) * (p3.getY() - p4.getY()))));
            intersectY = (((p1.getY() - p2.getY()) * (((p3.getY() - p4.getY()) * (p3.getX()) - ((p3.getX() - p4.getX()) * p3.getY()))) - (((p1.getY() - p2.getY()) * p1.getX()) - ((p1.getX() - p2.getX()) * p1.getY()) * (p3.getY() - p4.getY()) ))) / (((p1.getY() -  p2.getY()) * (p3.getX() - p4.getX())) - ((p1.getX() - p2.getX()) * (p3.getY() - p4.getY()))); 
            intersection =  new Point(intersectX, intersectY);
            return intersection;
        }
    }
}
        
   