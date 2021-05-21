package hw11;

import java.util.Scanner;

public class KnapsackProblemOne {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //read the scanner
        System.out.print("Enter the number of items: ");
        int numberOfItems = input.nextInt();
        System.out.print("Enter the weights for each item: ");
        double [] weightOfItems = new double[numberOfItems + 1];
        for (int i = 0; i < numberOfItems; i++) {
            weightOfItems [i] = input.nextDouble();
        }
        System.out.print("Enter the weight limit for the bag: ");
        double bagWeightLimit = input.nextDouble();
        System.out.print("The maximum weight of the items placed in the bag is " + m(numberOfItems, bagWeightLimit, weightOfItems));
    }

    public static double m(int i, double wieghtLimit, double [] weights) {
        //Base case
        if (i == 0 || wieghtLimit == 0) {
            return 0.0;
        }
        if (weights[i] > wieghtLimit) {
            return m(i - 1, wieghtLimit, weights);
        }
        else {
            return Math.max(m(i - 1, wieghtLimit, weights), weights[i] + m(i - 1, wieghtLimit - weights[i], weights));
        }
    }
}