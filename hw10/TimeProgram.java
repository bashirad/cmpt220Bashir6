package hw10;

//import scanner
import java.util.Scanner;

public class TimeProgram {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //prompt the user to enter time
        System.out.print("Enter time1 (hour minute second): ");
        String hour = input.next();
        String minute = input. next();
        String second = input.next();

        //System.out.print ( hour + " " + hour + " " + minute + " " + minute + " " + second + " " + second);
        long realHour = Long.parseLong(hour);
        long realMinute = Long.parseLong(minute);
        long realSecond = Long.parseLong(second);

        Time time = new Time(realHour * 3600 + realMinute + realSecond);
        Time time2 = new Time();
        System.out.println(time.getHour() + " hours " + time.getMinute() + " minutes " + time.getSecond() + " seconds");
        System.out.println("Elapsed seconds in time1: " + realHour * 3600 + realMinute + realSecond);

        System.out.println(time2.getHour() + " hours " + time2.getMinute() + " minutes " + time2.getSecond() + " seconds");
        System.out.print("Enter time2 (Elapsed Time): ");
        long elapTime2 = input.nextLong();
        time2.setTime(elapTime2);
        System.out.println(time2.getHour() + " hours " + time2.getMinute() + " minutes " + time2.getSecond() + " seconds");
        System.out.print("Elapsed Time in time2 is: " + elapTime2);

    }
}

class Time {
    private long mTime;

    public Time() {
        mTime = System.currentTimeMillis();
    }

    public Time(long time) {
        mTime = time;
    }
    public Time(int hour, int minute, int second) {
    }

    public void setTime(long elapsedTime) {
        mTime = elapsedTime;
    }


    public int getHour() {
        return (int)(mTime / (1000 * 60 * 60)) % 24;
    }

    public int getMinute() {
        return (int)(mTime / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int)(mTime / 1000) % 60;
    }

}

 class Comparison implements Comparable<Time> {
    return  this.getHour().compareTo(Time.getHour);    
}