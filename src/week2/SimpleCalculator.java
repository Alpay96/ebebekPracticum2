package week2;

import java.util.Scanner;
/**
 * @author ALPAY
 * simple calculator with switch-case
 **/
public class SimpleCalculator {

    public static void main(String[] args) {

        int n1, n2, choice;
        Scanner scan = new Scanner(System.in);

        System.out.print("First Number: ");
        n1 = scan.nextInt();

        System.out.print("Second Number: ");
        n2 = scan.nextInt();

        System.out.println("Choose An Option\n1-Summation\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("\nOption:");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
                break;

            case 2:
                System.out.println("Difference between " + n1 + " and " + n2 + " is " + (n1 - n2));
                break;
            case 3:

                System.out.println(n1 + " times " + n2 + " is " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println(n1 + " divided by " + n2 + " is " + (n1 / n2));
                }

                else
                    System.out.println("You cannot divide a number by '0'.");
                break;

            default:
                System.out.println("Error!! Please choose from 1-4.");
        }
    }
}
