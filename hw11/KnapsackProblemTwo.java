package hw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KnapsackProblemTwo extends Comparators{
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //read the scanner
        System.out.print("Enter the number of items: ");
        int numberOfItems = input.nextInt();
        System.out.print("Enter the weight for each item: ");
        double [] weightOfItems = new double[numberOfItems + 1];
        for (int i = 0; i < numberOfItems; i++) {
            weightOfItems [i] = input.nextDouble();
        }
        System.out.print("Enter the weight limit for the bag: ");
        double bagWeightLimit = input.nextDouble();
        System.out.print("The maximum weight of the items placed in the bag is " + m(numberOfItems, bagWeightLimit, weightOfItems));
        input.close();
    }

    public static ArrayList<Integer> m(int i, double wieghtLimit, double [] w) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        //Base case
        if (i == 0 || wieghtLimit == 0) {
            return null;
        }
        if (w[i] > wieghtLimit) {
            return m(i - 1, wieghtLimit, w);
        }
            answer = answer.add(Collections.max(m(i - 1, wieghtLimit, w), m(i - 1, wieghtLimit, w).set(i - 1, (int)w[i])));
            wieghtLimit = wieghtLimit - w[i];
            return answer;
    }
}