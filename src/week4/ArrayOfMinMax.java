package week4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfMinMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] list = {132, 95, 812, -64, -8, 619, 883, 78};

        System.out.println("Array--> " + Arrays.toString(list));
        System.out.print("Please enter a number to see min/max the nearest: ");
        int val = scan.nextInt();
        minMax(list, val);
    }

    public static void minMax(int[] arr, int val) {
        Arrays.sort(arr);
        if (val >= arr[0] && val <= arr[arr.length - 1]) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= val && arr[i + 1] >= val) {
                    System.out.println("Nearest small number: " + arr[i]);
                    System.out.println("Nearest big number: " + arr[i + 1]);
                }
            }
        } else
            System.out.println("Value entered out of range!!");
    }
}
