package ch_01;

/**
 * lowing 2 * 2 system of linear equation:
 * ax + by = e / cx + dy = f
 * x = ed - bf / ad - bc
 * y = af - ec / ad - bc
 *  Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 */
public class Exercise01_13 {
    public static void main(String[] args){
        //  x = ed - bf / ad - bc
      double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9, x, y;

      x = (e * d - b * f) / (a * d - b * c);
      y = (a * f - e * c) / (a * d - b * c);

        System.out.println("Result for x: " + x);
        System.out.println("Result for y: " + y);
    }
}
