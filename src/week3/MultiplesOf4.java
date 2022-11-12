package week3;

import java.util.Scanner;

public class MultiplesOf4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k, total = 0;

        do {
            System.out.print("Enter a number: ");
            k = scan.nextInt();
            if (k % 4 == 0) {
                total += k;
            }
        } while (k % 2 == 0);

        System.out.println("Sum even numbers and of multiples of 4: " + total);
    }
}
