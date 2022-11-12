package week3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Sum of digits :" + sum);
    }
}
