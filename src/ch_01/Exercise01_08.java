package ch_01;

/**
 * Area and perimeter of a circle
 *
 * Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 */
public class Exercise01_08 {
    public static void main(String[] args) {

        double radius = 5.5;
        double pi = Math.PI;

        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println(perimeter);
        System.out.println(area);

    }
}
