import java.util.ArrayList;
import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a string to split: ");
        //Read scanner
        String userString = input.nextLine();
        //Read scanner
        System.out.print("Enter delimiters: ");
        input.close();
    }


    public static ArrayList<Character> splitDelimiters(String delimiters){
        ArrayList<Character> delimList = new ArrayList<>();
        for(int i = 0; i < delimiters.length(); i++) {
            ArrayList<String> splitted = splitString(s, delimiters);
            return splitted;
        }
    }

    public static ArrayList<String> split(String s, String delimiters){
        ArrayList<String> splittedMessage = new ArrayList<String>();
        String str = "";
        
        for (int i = 0; i <= s.length(); i++){
            if (delimiters.charAt(i) == s.charAt(i)){
                splittedMessage.add(", ");
            }
            else {
                str += s.charAt(i);
                splittedMessage.add(str);
            }
            }
        return splittedMessage;
    }

}