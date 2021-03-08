package hw01;

//This program computes the acceleration based on the difference of velocity over time
public class ComputeAcceleration {

    //main method
    public static void main(String[] orgs) {

        //declaring variables
        double initialVelocity = 5.6;
        double finalVelocity = 10.5;
        double time = 0.5;

        //calculating the acceleration
        double acceleration = ((finalVelocity - initialVelocity)/time);

        //displaying the result
        System.out.println("The acceleration is " + acceleration ); // JA
        System.out.println("based on initial velocity of 5.6 m/s and a final velocity of 10.5 m/s in 0.5 s span of time");
    }
    
}
