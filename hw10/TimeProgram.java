package hw10;
//import scanner
import java.util.Scanner;

public class TimeProgram  {
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

        System.out.println(time1.getHour() + " hours " + time1.getMinute() + " minutes " + time1.getSecond()+ " seconds ");
        System.out.println("Elapsed seconds in time1: " + realHour*3600 + realMinute*60 + realSecond);
        System.out.print("Enter time2 (elapsed time): ");
        Time time2 = new Time(input.nextLong());
        System.out.println(time2.getHour() + " hours " + time2.getMinute() + " minutes " + time2.getSecond()+ " seconds ");
        System.out.println("Elapsed seconds in time1: " + time2);
        
    }


class Time {
    private long time;

    public Time() {
        time = System.currentTimeMillis();
    }

    public Time(long time) {
        this.time = time;
    }

    public Time(long hour, long minute, long second) {
    }

    public void setTime(long elapsedTime) {
        elapsedTime = System.currentTimeMillis() / 1000;
    }


    public long getHour() {
        return (time / (1000 * 60 * 60)) % 24;
    }

    public long getMinute() {
        return (time / (1000 * 60)) % 60;
    }

    public long getSecond() {
        return (time / 1000) % 60;
    }
}
}
