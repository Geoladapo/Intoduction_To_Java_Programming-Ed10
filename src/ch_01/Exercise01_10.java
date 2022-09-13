package ch_01;

/**
 *  (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 */
public class Exercise01_10 {
    public static void main(String[] args) {
        double km = 14;
        double kmToMiles = km / 1.6;
        double speed = kmToMiles / (45.5 / 60);

        System.out.println(speed);
    }
}
