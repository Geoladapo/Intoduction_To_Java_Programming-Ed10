package ch_02;

import java.util.Scanner;

/**
 *  (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * length = v2
 * 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2
 * ), and displays the minimum runway length. Here is a sample run:
 */
public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. prompt for the acceleration and the speed
        System.out.print("Enter the speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();

//        2. calculate the run-way length to take off
        double length = Math.pow(v, 2) / (2 * a);

        //        3. print the result
        System.out.println("The minimum runway length for this airplane is " + length);


    }
}
