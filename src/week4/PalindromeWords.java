package week4;

import java.util.Scanner;

public class PalindromeWords {
    static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "";

        while (!word.equals("0")) {
            System.out.print("Type a word: ");
            word = scan.next();

            if (isPalindrome(word) && !word.equals("0"))
                System.out.println(word + " is a palindrome word.");
            else if (!isPalindrome(word) && !word.equals("0"))
                System.out.println(word + " is not a palindrome word.");

            System.out.println();
        }
        System.out.println("Terminated.");
    }
}
