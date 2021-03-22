//package hw03;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;

public class RandomPoint {
    public static void main(String[] orgs){

    //generate a random number
    double xCoordinate = 5 - Math.random() * 10;
    double yCoordinate = 5 - Math.random() * 10;

    //Display the number
    System.out.println("The point is ( "+ xCoordinate + ", " + yCoordinate + ")" );
    
    //Calculate the point's distance from the center of the circle
    double distanceFromCircleCenter = Math.sqrt((xCoordinate * xCoordinate) + (yCoordinate * yCoordinate));
    
    //Display the distance from the center of the circle
    System.out.println("and its distance to the center is " + distanceFromCircleCenter);

    }
}
