package ch_02;

import java.util.Scanner;

/**
 *  (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. The formula for the conversion is as follows:
 *
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 *
 *  Oladapo Elijah
 */
public class Exercise02_01 {
    public static void main(String[] args) {

//        1. Read a Celsius degree in a double value from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        int celsiusDeg = scanner.nextInt();

//        2. do the conversion from Celsius deg -> Fahrenheit deg
        double fahrenheit =( 9.0 / 5) * celsiusDeg + 32;

//        3. output the Result to the console
        System.out.println(celsiusDeg + " Celsius is " + fahrenheit + " Fahrenheit" );
    }
}
