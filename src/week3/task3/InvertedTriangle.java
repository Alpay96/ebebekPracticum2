package week3.task3;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int rowNumber = scan.nextInt();
        int temporary = rowNumber;                  // The digits value is assigned to a variable named temporary.
        for (int i = 1; i <= rowNumber; i++) {
            for (int s = 0; s < (i); s++) {
                System.out.print(" ");
            }
            for (int k = (temporary * 2 - 1); k > 0; k--) {
                System.out.print("*");
            }
            temporary--;                // adding stars and before moving down one line, the temporary value is reduced by 1.
            System.out.println();
        }
    }
}
