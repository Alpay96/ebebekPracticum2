package week4;

import java.util.Arrays;

public class EvenNumbersRepeatingInArrays {
    public static void main(String[] args) {
        int[] list = {9, 9, 1, 4, 9, 8, 3, 3, 3, 3, 12, 12, 12, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 8, 4, 12, 9, 4};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] % 2 == 0 && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Array--> " + Arrays.toString(list));
        System.out.print("Duplicated even numbers: ");

        for (int element : duplicate) {
            if (element != 0) {
                System.out.print(element + "  ");
            }
        }
    }

    public static boolean isFind(int[] arr, int val) {
        for (int element : arr) {
            if (element == val) {
                return true;
            }
        }
        return false;
    }
}
