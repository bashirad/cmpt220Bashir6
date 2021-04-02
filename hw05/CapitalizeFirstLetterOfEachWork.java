package hw05;


//import scanner
import java.util.Scanner; 

//import arrays
import java.util.Arrays;


public class CapitalizeFirstLetterOfEachWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringFromUser = input.nextLine();
        input.close();
        capitalizeFirstLetter(stringFromUser);

    }

    //method for capitalizing first letter of each word
    public static String capitalizeFirstLetter (String message){
        String messageArray[] = message.split(" ");
        
        for (int i = 0; i < messageArray.length; i++){
            messageArray[0].toUpperCase();
            if (messageArray[i] == " "){
                messageArray[i + 1].toUpperCase();
            }
        }
        return Arrays.toString(messageArray);
    }
}
