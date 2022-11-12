package week3;

import java.util.Scanner;

public class AverageOfNumbersDivisibleBy3And4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k, counter = 0, total = 0;
        double average;

        System.out.print("Enter a number: ");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 12 == 0) {                // Numbers that are divisible by 3 and 4 are also divisible by 12.
                counter++;
                total += i;
            }
        }
        average = total / counter;
        System.out.println("The average of numbers divisible by 12, from 0 to the " + k + "\n" + "Average: " + average);
    }
}
