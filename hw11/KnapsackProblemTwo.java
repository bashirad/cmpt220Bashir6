package hw11;

import java.util.ArrayList;
import java.util.Scanner;

public class KnapsackProblemTwo{
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //read the scanner
        System.out.print("Enter the number of items: ");
        int numberOfItems = input.nextInt();
        System.out.print("Enter the weight for each item: ");
        double [] weightOfItems = new double[numberOfItems + 1];
        for (int i = 1; i <= numberOfItems; i++) {
            weightOfItems [i] = input.nextDouble();
        }
        System.out.print("Enter the weight limit for the bag: ");
        double bagWeightLimit = input.nextDouble();
    
        //display the result
        ArrayList<Integer> answer = m(numberOfItems, bagWeightLimit, weightOfItems);
        System.out.println("The maximum weight of the items placed in the bag is " + answer.toString());

        /*for (int i = 0; i < answer.size();i++){		
            System.out.println("The items in the bag are #" + answer.indexOf(i) + " "); 
            System.out.println("The weights of the items in the bag are " + answer.get(i) + " ");
	    }*/

        input.close();
    }

    public static ArrayList<Integer> m(int i, double wieghtLimit, double [] w) {
        //Base case
        if (i == 0 || wieghtLimit == 0) {
            return new ArrayList<Integer>(); //return a new empty arraylist
        }
        else if (w[i] > wieghtLimit) {

            return m(i - 1, wieghtLimit, w);
        }
        else {
            ArrayList<Integer> partOne = m(i - 1, wieghtLimit, w);
            //calculate the weight first recursion call
            int sum1 = 0; 
            for (int j = 0; j < partOne.size(); i++){
                sum1 += w[partOne.get(i)];
            }
            /*for (Integer e: partOne){
                sum1 += w[e.intValue()];
            }

            //do the same for the other one
            ArrayList<Integer> partTwo = m(i - 1, wieghtLimit - w[i], w);
            //calculate the weight of the other recursion call
            int sum2 = 0;
            for (Integer e: partTwo){
                sum2 += w[e.intValue()];
            }

            //compare the values, like find the bigger of sum1 and sum2+ w[i] and return the arraylist
            if (sum1 > (sum2 + w[i])) {
                return partOne;
            }
            else {
                return partTwo;
            }*/
            return partOne;
            
        }
    }
}