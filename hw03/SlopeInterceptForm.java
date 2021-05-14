package hw03;

//importing scanner
import java.util.Scanner;

public class SlopeInterceptForm {
    public static void main(String[] orgs){

        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //getting the coordinates from the user
        System.out.print("Enter the coordinates for two points: ");

        double firstX = input.nextDouble();
        double firstY = input.nextDouble();
        double secondX = input.nextDouble();
        double secondY = input.nextDouble();

        //stop scanning
        input.close();

        //calculate the slope
        double slope = (secondY-firstY) / (secondX - firstX);

        //calculate the y-intercept
        double yIntercept = firstY - (slope*firstX);

        //Display the slope intercept form of the line equation
        if (slope == 1 && yIntercept == 0){
            System.out.print("The line equation for two points (" + firstX + ", " + firstY + ") and (" + secondX + ", " + secondY + ") is y = x ");
        }

        else if (slope != 1 && yIntercept == 0){
            System.out.print("The line equation for two points (" + firstX + ", " + firstY + ") and (" + secondX + ", " + secondY + ") is y = " + (int)(slope*100000)/100000.0 + "x");
        }

        else if (slope == 1){
            System.out.print("The line equation for two points (" + firstX + ", " + firstY + ") and (" + secondX + ", " + secondY + ") is y = x + " + (int)(yIntercept*100000)/100000.0);
        }

        else { 
            System.out.print("The line equation for two points (" + firstX + ", " + firstY + ") and (" + secondX + ", " + secondY + ") is y = " + (int)(slope*100000)/100000.0 + "x " + (int)(yIntercept*100000)/100000.0);
        }    

}

}