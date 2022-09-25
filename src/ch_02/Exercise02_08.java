package ch_02;

import java.util.Scanner;

/**
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so that it prompts the user to enter
 * the time zone offset to GMT and displays the time in the specified time zone. Here
 * is a sample run:
 */
public class Exercise02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();

        long totalMillSeconds = System.currentTimeMillis();

        long totalSeconds = totalMillSeconds / 60;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        currentHour += timeZone;

        System.out.println("The current time is "+ currentHour + ":"+ currentMinutes +":" + currentSeconds);

    }
}
