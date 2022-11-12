package week3;

import java.util.Scanner;

public class DiamondShapeWithStars {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int k = n; k < (n + i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((n - i) * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
