package week3.task6;

import java.util.Scanner;

// A program in Java language that uses the "Recursive" method for exponentiation, whose base and exponent values are taken from the user.

public class ExponentialNumber {
    static int i, temp, exponent, result = 1;

    public static void main(String[] args) {

        System.out.println("Result: " + exponentialCalc(temp));
    }

    static int exponentialCalc(int n) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        temp = scan.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = scan.nextInt();

        for (i = 0; i < exponent; i++) {
            result *= temp;
        }
        return result;
    }
}
