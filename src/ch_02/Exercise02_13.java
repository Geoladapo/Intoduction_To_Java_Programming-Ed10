package ch_02;

import java.util.Scanner;

/**
 *  (Financial application: compound value) Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
 * After the first month, the value in the account
 * becomes
 * 100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month. (In Exercise 5.30, you will use a
 * loop to simplify the code and display the account value for any month.)
 */
public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        1. Enter savings amount, count.. calc interestRate, interestFactor
        System.out.print("Enter the monthly saving amount: ");
        int savingAmount = input.nextInt();
        double interestRate = 0.05 / 12;
        double interestFactor = (1 + interestRate);
        double total = 0;
        int count = 6;

//        2. calculate the savings after 6 month
        for (int i = 0; i < count; i++) {
            total = (total + savingAmount) * interestFactor;
        }

//        3. print the result
        System.out.printf("After the sixth month, the account value is $%.2f", total);
    }
}
