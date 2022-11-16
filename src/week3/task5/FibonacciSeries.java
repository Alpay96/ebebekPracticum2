package week3.task5;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, c, d;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Fibonacci series: ");
        d = scan.nextInt();
        System.out.print(a + ", " + b);

        for (int i = 2; i <= d; i++) {
            c = a + b;                  // Each number is added up with the previous number.
            System.out.print(", " + c); // The result obtained is written on the right side of the figure.
            a = b;
            b = c;
            System.out.print(" ");
        }
    }
}
