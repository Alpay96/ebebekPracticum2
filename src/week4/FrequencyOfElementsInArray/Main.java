package week4.FrequencyOfElementsInArray;

import java.util.Arrays;

// A program in Java language that finds the frequency of the elements in the array.

public class Main {
    public static void main(String[] args) {
        int[] array = {36, 13, 36, 14, 14, 4, 36, 76, 43, 13, 36, 14, 13, 4, 55};
        int[] frequency = new int[array.length];

        for (int i = 0; i < array.length; i++)
            frequency[i] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]))
                    frequency[i]++;                         // The counter increments for each repeating number.
            }
        }

        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]))      // Find repeating numbers and set them to zero
                    array[j] = 0;                            // So that the loop does not repeat.
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (frequency[i] > 1) {
                if (array[i] != 0)
                    System.out.println("The number " + array[i] + " repeated " + frequency[i] + " times.");
            }
        }
    }
}
