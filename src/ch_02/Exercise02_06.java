package ch_02;

import java.util.Scanner;

/**
 *  (Sum the digits in an integer) Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 * sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */
public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. Read an integer
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = num; i > 0; i++){
//            2. Extract and Add the sum together
            sum += num % 10;
            num /= 10;
        }
//        3. Print out the sum
        System.out.println(sum);

    }
}
