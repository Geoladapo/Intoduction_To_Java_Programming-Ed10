package ch_02;

import java.util.Scanner;

/**
 *  (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
 * The formula for computing the distance is 2(x2 - x1)
 * 2 + (y2 - y1)
 * 2
 * . Note that
 * you can use Math.pow(a, 0.5) to compute 2a.
 */
public class Exercise02_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter for x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter for x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double val = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double distance = Math.pow(val, 0.5);

        System.out.println("The distance between the two points is "+distance);
    }
}
