package week3.task1;

import java.util.Scanner;

/* A Java program that finds the largest and smallest numbers from N counting numbers entered
from the keyboard and writes these numbers to the screen.
*/

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter, number, min = 1, max = 1;

        System.out.print("How many numbers will you enter: ");  // information is obtained from the user how many numbers to enter.
        counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {                // Loops as many as the number to be entered
            System.out.print("number " + i + "-> ");
            number = scan.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max) {                           // Find max number
                max = number;
            }
            if (number < min) {                           // Find min number
                min = number;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number:  " + min);
    }
}
