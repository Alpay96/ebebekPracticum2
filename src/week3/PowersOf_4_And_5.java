package week3;

import java.util.Scanner;

public class PowersOf_4_And_5 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit number: ");
        n = scan.nextInt();

        System.out.println("Powers of 4:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + "\t");
        }

        System.out.println("\n\nPowers of 5:");
        for (int j = 1; j <= n; j *= 5) {
            System.out.print(j + "\t");
        }
    }
}
