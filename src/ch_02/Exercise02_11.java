package ch_02;

import java.util.Scanner;

/**
 *(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer. Here is a sample run of the program:
 *
 //////////////////////////////////////////////////////////////////////////////////
 /////////////////////////////////
 *  (Population projection) The U.S. Census Bureau projects population based on the
 * following assumptions:
 *  ■ One birth every 7 seconds
 *  ■ One death every 13 seconds
 *  ■ One new immigrant every 45 seconds
 *  Write a program to display the population for each of the next five years. Assume the
 * current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 * integers perform division, the result is an integer. The fractional part is truncated. For
 * example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 * the fractional part, one of the values involved in the division must be a number with a
 * decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */
public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int curPop = 312032486;

//        1. prompt for number of Years
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

//        2. find the total population in nxt 5 years
//        ** get total number of seconds in a year
        int secondsInYear = 365 * 24 * 60 * 60;
//        ** birth in a year
        double birthInYear = secondsInYear / 7.0;
//        ** death in a year
        double deathInYear = secondsInYear / 13.0;
//        ** new immigrant in a year
        double immigrantInYear = secondsInYear / 45.0;

        for (int i = 1; i < years + 1; i++) {
//            3. Print the result
            curPop += birthInYear - deathInYear + immigrantInYear;
            System.out.println("In year"+ i +" we have "+ curPop + " in the world");
        }
    }
}
