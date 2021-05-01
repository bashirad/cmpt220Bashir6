import java.util.ArrayList;
import java.util.Scanner;

public class LargestObjectFirst {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of objects: ");

        //read the scanner
        int Objectsnum = input.nextInt();
        ArrayList<number> objects = new ArrayList<>();
        System.out.print("Enter the weights of the objects: ");

        for (int i = 0; i < Objectsnum; i++) {
        objects.add(input.nextInt());
        }
        int pin = 1;
        while(!objects.isEmpty()) {
        System.out.println("Pin " + pin++ + " has objects with weight " + getPin(objects, 10));
  }
 }
 

}