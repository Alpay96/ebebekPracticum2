package week3;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        boolean a = false;

        do {
            System.out.print("Enter a number: ");
            n1 = input.nextInt();
            System.out.print("Enter a number: ");
            n2 = input.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Please enter positive numbers.\n");
            } else
                a = true;
        } while (!a);

        if (n2 < n1) {
            int tempN2 = n2;
            n2 = n1;
            n1 = tempN2;
        }

        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("GCD: " + i);
                break;
            } else
                i--;
        }

        int j = n2;
        while (j >= (n1 * n2) / n1) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                System.out.println("LCM: " + j);
                break;
            } else
                j++;
        }
    }
}
