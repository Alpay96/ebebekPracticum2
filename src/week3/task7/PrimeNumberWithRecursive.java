package week3.task7;

import java.util.Scanner;

// A program that finds whether the number received from the user is a "Prime" number, using the "Recursive" method in Java language.

public class PrimeNumberWithRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        prime(number, 2);
    }

    static void prime(int number, int i) {
        if (i == number) {
            System.out.println(number + " is a prime number.");
            return;
        } else if (number % i == 0) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        prime(number, i + 1);
    }
}
