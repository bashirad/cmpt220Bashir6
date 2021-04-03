package hw05;

//import Scanner
import java.util.Scanner;

public class HrsMinSec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        int totalSeconds = input.nextInt();
        input.close();

        System.out.print("The hours, minutes, and seconds for total seconds " + totalSeconds + " is " + format(totalSeconds));
    }
    //converting time
    public static String format(long seconds){
        String result = " ";
        if (seconds <= 60) {
            result += "00:" + "00:" + seconds;
        }
        else {
            if (seconds <= 3599){
                result += "00:" + (seconds / 60) + ":" + (seconds % 60);
            }
            else {
                result += (seconds / 3600) + ":" + (seconds % 60) + ":" + (seconds % 60);
            }
        }
        return result;
    }





}
