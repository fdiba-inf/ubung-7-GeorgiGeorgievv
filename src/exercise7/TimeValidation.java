package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        boolean timeValid = false;
        if (areHoursValid(hours)&&areMinutesValid(minutes))
        {
            timeValid=true;
        }
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
        if(hours >= 0 && hours < 24)
        {
            return true;
        }
        return false;
    }

    public static boolean areMinutesValid(int minutes) {
        if (minutes >= 0 && minutes < 60)
        {
            return true;
        }
        return false;
    }
}