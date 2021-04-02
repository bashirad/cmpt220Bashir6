package Test;

import java.util.*;

public class TestingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringFromUser = input.nextLine();
        input.close();
        System.out.print("The new string is: " + capitalizeFirstLetter(stringFromUser));

    }

      //method for capitalizing first letter of each word
      public static String capitalizeFirstLetter (String message){

        String[] letters = name.split("(?<=.)");

        //creating an array that has message length
        char [] messageArray = new char[message.length()];

        //copying characters of message into the created array
        for (int i = 0; i < messageArray.length; i++){
            messageArray [i] = message.charAt(i);
        }

        //capitalizing first letters of words
        for (int i = 0; i < messageArray.length; i++){
            messageArray[0] = Character.toUpperCase(messageArray[0]);
            if (messageArray[i] == ' '){
                messageArray[i + 1] = Character.toUpperCase(messageArray [i +1]);
            }
        }
        String messageString = Arrays.toString(messageArray);
       
        return messageString;
    }

}
