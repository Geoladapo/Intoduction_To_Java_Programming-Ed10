package ch_02;

import java.util.Scanner;

/**
 *  (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. Here is a sample run:
 */
public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. prompt the user to enter the minutes
        System.out.print("Enter the number of minutes: ");
        int num = input.nextInt();
//        2. convert minutes to years and days
        int years = num / 60 / 24 / 365;
        int days = num / 60 / 24 % 365;
//        3. print the result
        System.out.println(num +" minutes is "+ years + " years and " + days + " days.");
    }
}
