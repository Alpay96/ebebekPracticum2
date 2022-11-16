package week3;

import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            System.out.println("The number entered is a PALINDROME number.");
            return true;
        } else {
            System.out.println("The number entered is not a PALINDROME number.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        System.out.println(isPalindrom(n));
    }
}
