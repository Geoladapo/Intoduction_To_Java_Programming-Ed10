package ch_02;

import java.util.Scanner;

/**
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
 *
 */
public class Exercise02_05 {
    public static void main(String[] args) {

//        1. Read the subtotal and gratuity.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble() / 100;

//        2. computes the gratuity and total
       double gratuityRate = subtotal * gratuity;
       double total = gratuityRate + subtotal;

//        3. display the result
        System.out.println("The gratuity is $"+ gratuityRate + " and the total is $"+ total);
    }
}
