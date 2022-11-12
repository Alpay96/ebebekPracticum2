package week3;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, combination, rnFactorial = 1, nFactorial = 1, rFactorial = 1;

        System.out.print("Enter the number of clusters: ");
        n = scan.nextInt();
        System.out.print("Enter the number of groups: ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            nFactorial = nFactorial * i;
        }
        for (int j = 1; j <= r; j++) {
            rFactorial = rFactorial * j;
        }

        for (int k = 1; k <= n - r; k++) {
            rnFactorial = rnFactorial * k;
        }
        combination = (nFactorial / (rFactorial * rnFactorial));
        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}
