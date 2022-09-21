package ch_02;

import java.util.Scanner;

/**
 * Convert pounds into kilograms ->  Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
 *
 */
public class Exercise02_04 {
    public static void main(String[] args) {
        double kilogram = 0.454;
        Scanner scanner = new Scanner(System.in);

//        1. Prompt the user to enter a number in pounds
        System.out.print("Enter a number in pounds: ");
        double pound = scanner.nextDouble();

//        2. convert it to kilograms -> [One pound is 0.454]
        double poundToKilogram = pound * kilogram;

//        3. display the result
        System.out.println(pound + " pound is "+ poundToKilogram + " kilogram");
    }
}
