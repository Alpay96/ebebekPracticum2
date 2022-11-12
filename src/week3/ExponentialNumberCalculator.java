package week3;

import java.util.Scanner;

public class ExponentialNumberCalculator {
    public static void main(String[] args) {
        int n, k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        n = scan.nextInt();
        System.out.print("Enter the upper number: ");
        k = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Answer: " + total);
    }
}
