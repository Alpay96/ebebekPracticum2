package week3;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        double harmonic = 0, result = 0;

        System.out.print("Enter a number: ");
        number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            result = (1.0 / i);
            harmonic += result;
        }
        System.out.println(harmonic);
    }
}
