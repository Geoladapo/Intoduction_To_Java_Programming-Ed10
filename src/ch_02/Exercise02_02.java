package ch_02;

import java.util.Scanner;

/**
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 * area = radius * radius * p
 * volume = area * length
 *
 */
public class Exercise02_02 {
    public static void main(String[] args) {
//        1. Read in the radius and length of a cylinder
        final double PI = 3.142;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

//        2. compute the area and volume
        double area = radius * radius * PI;
        double volume = area * length;

//        3. Output the Result
        System.out.println("The area is : " + area);
        System.out.println("The volume is : " + volume);

    }
}
