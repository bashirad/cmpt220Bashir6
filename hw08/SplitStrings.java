import java.util.ArrayList;
import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {
<<<<<<< HEAD
        //Create a scanner
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a string to split: ");
        //Read scanner
=======
        // Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string and delimiters: ");
        // Read scanner
>>>>>>> e34eb8cd3ad41d1220c1f910ec7f55115dd88135
        String userString = input.nextLine();
        //Read scanner
        System.out.print("Enter delimiters: ");
        input.close();
    }

<<<<<<< HEAD

    public static ArrayList<Character> splitDelimiters(String delimiters){
        ArrayList<Character> delimList = new ArrayList<>();
        for(int i = 0; i < delimiters.length(); i++) {
            ArrayList<String> splitted = splitString(s, delimiters);
            return splitted;
        }
    }

    public static ArrayList<String> split(String s, String delimiters){
=======
    public static ArrayList<String> split(String s, String delimiters) {
>>>>>>> e34eb8cd3ad41d1220c1f910ec7f55115dd88135
        ArrayList<String> splittedMessage = new ArrayList<String>();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (delimiters.charAt(i) == s.charAt(i)) {
                splittedMessage.add(", ");// JA: ?
            } else {
                str += s.charAt(i);
                splittedMessage.add(str);
            }
        }
        return splittedMessage;
    }

}