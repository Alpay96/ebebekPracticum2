package week3.task6;

import java.util.Scanner;

// A program in Java language that uses the "Recursive" method for exponentiation, whose base and exponent values are taken from the user.

public class ExponentialNumber {
    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;

        else if (base == 1)
            return 1;

        else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int bottom = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scan.nextInt();

        System.out.println("Result :" + power(bottom, exponent));
    }
}
