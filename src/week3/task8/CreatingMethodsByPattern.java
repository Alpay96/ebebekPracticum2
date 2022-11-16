package week3.task8;

import java.util.Scanner;

public class CreatingMethodsByPattern {
    static void pattern(int N, int tempNumber, int result) {
        if (tempNumber > 0) {
            System.out.print(result + " ");
            result -= 5;

            if (result <= 0) {
                tempNumber = result;
            }
        } else {
            System.out.print(result + " ");
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
