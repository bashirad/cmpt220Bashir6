//package hw05;

//import scanner
import java.util.Scanner; 

public class CapitalizeFirstLetterOfEachWork {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringFromUser = input.nextLine();
        input.close();
        System.out.print("The new string is: " + capitalizeFirstLetter(stringFromUser));

    }

      //method for capitalizing first letter of each word
      public static String capitalizeFirstLetter (String message){
        String result = "";
        result += Character.toUpperCase(message.charAt(0));
        for (int i = 1; i < message.length(); i++){
            if (message.charAt(i) != ' '){
                result += message.charAt(i);
            }
            else if (message.charAt(i) == ' '){
                result += " ";
                result += Character.toUpperCase(message.charAt(i + 1));
                i++;
            }
            }
       return result;
        }

    }