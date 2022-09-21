package ch_02;

import java.util.Scanner;

/**
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 */
public class Exercise02_03 {
    public static void main(String[] args) {
        double meter = 0.305;
//        1. Read a number in feet
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = scanner.nextDouble();

//        2. convert it to meters (1 feet is 0.305m)
        double feetToMeters = feet * meter;

//        3. display the result
        System.out.println(feet +" feet is "+ feetToMeters + " meters.");
    }
}
