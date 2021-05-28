package hw08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestObjectFirst {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of objects: ");

        //read the scanner
        int numObjects = input.nextInt();
        System.out.print("Enter the weights of the objects: ");

        Integer[] weights = new Integer[numObjects];
        for (int i = 0; i < numObjects; i++) {
            weights[i] = input.nextInt();
        }
        //order weights
        Arrays.sort(weights);

        //add the weights to the pins
        ArrayList<Pin> pins = new ArrayList<>();
        for (int i = numObjects - 1; i >= 0; i-- ) {
            boolean added = false;
            for(Pin pin : pins){
                if( added = pin.addElement(weights[i])){
                    break;
                }
            }
            if(!added){
                Pin pin = new Pin();
                pin.addElement(weights[i]);
                pins.add(pin);
            }
        }
        for (Pin pin : pins){
            System.out.println(pin);
        }
  }
 }


class Pin extends ArrayList<Integer> {
    private static final int CAPACITY = 10;
    static int pins = 0;
    private int pinId;

    Pin() {
        super();
        pins++;
        pinId = pins;
    }

    public boolean addElement(int elem) {
        int weight = 0;
        for(int i = 0; i <size();i++){
            weight += get(i).intValue();
        }
        if(weight + elem <= CAPACITY){
            add(elem);
            return true;
        }
        return false;

    }
    @Override 
    public String toString(){
        String message = "Pin " + pinId + " has objects with weight ";
        for (int i = 0; i < size(); i++){
            
        }
        return message;
    }
}