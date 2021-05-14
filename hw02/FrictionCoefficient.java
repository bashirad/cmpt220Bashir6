package hw02;

//impoting Scanner
import java.util.Scanner;

public class FrictionCoefficient {
    public static void main(String[] args) {

            //Creating a Scanner
        Scanner input = new Scanner(System.in);

            //prompting user to enter force, mass and acceleration
        System.out.print("Enter the friction force in Newtons: ");
        double force = input.nextDouble();
        System.out.print("Enter the object's mass in kg: ");
        double mass = input.nextDouble();
        System.out.print("Enter the object's acceleration in m/s^2: ");
        double acceleration = input.nextDouble();
        
            //stop scanning = no more input to read
        input.close();

            //calculating the coefficient for friction
        double coefficient = (force - (mass * acceleration)) / (mass * 9.8);

        //print results
        System.out.println("The coefficient for friction is " + (int)(coefficient* 1000000) / 1000000.0 );

    }
}
