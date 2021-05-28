package hw06;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompting the user to enter the two words 
        System.out.print("Enter the first word: ");
        String userS1 = input.nextLine();
        System.out.print("Enter the second word: ");
        String userS2 = input.nextLine();

        //display the results
        if (isAnagram(userS1, userS2)) {
            System.out.println(userS1 + " and " + userS2 + " are anagram.");
        }
        else {
            System.out.println(userS1 + " and " + userS2 + " are not anagram.");
        }
        input.close();
    }

    //method to check whether two words are anagrams
    public static boolean isAnagram(String s1, String s2){
        if (s1.length() == s2.length()){
            for (int i = 0; i <s1.length(); i++){
                s2.contains(s1.substring(i));
            }
        return true;
        }
        return false;
        
    }
}