package week3.task8;

import java.util.Scanner;

/*
Subtracts 5 from the entered number up to where the entered number is 0 or negative.
It prints the last value to the screen during each subtraction.
Adds 5 again after the number is negative or 0.
It also prints the last value of the number on the screen in each addition operation.
 */

public class CreatingMethodsByPattern {
    static void pattern(int N, int tempNumber, int result) {
        if (tempNumber > 0) {
            System.out.print(result + " ");
            result -= 5;

            if (result <= 0) {
                tempNumber = result;
            }
        } else {
            System.out.print(result + " ");     // Adds 5 again after the number is negative or 0.
            result += 5;

            if (result == N) {
                System.out.print(result + " ");
                return;
            }
        }
        pattern(N, tempNumber, result);
    }

    public static void main(String[] args) {
        int result, tempNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scan.nextInt();

        result = N;
        tempNumber = N;
        pattern(N, result, tempNumber);
    }
}
