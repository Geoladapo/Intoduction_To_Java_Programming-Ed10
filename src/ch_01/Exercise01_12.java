package ch_01;

/**
 *  (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 */
public class Exercise01_12 {
    public static void main(String[] args) {

        double hr = 1;
        double min = 40;
        double secs = 35;
        double totaldist = 24;
        double kilodist = totaldist * 1.6;
        double convertomin = hr * 60 + min + secs / 60;
        double KPH = 60 * convertomin / kilodist;

        System.out.println(KPH);
    }
}
