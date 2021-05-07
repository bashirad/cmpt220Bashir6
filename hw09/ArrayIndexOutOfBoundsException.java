import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        //build an array with one hundred random intergers
        int[] randomArray = new int[100]; 
        for (int j = 0; j < randomArray.length; j++) {
            randomArray[j] = (int) (Math.random() * 100);
        }

        //create a scanner
        Scanner input = new Scanner(System.in);
        //promt the user to enter the index of the array
        System.out.print("Enter the index of the array: ");
        input.close();
        
        try {
            int theIndex = input.nextInt();
            System.out.println("In the array, the element at " + theIndex + " is " + randomArray[theIndex]);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println(ex );
        }

    }
}