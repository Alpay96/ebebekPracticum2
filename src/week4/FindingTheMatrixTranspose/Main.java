package week4.FindingTheMatrixTranspose;

import java.util.Arrays;

// Java language program that finds the transpose of a matrix created with multidimensional arrays.

public class Main {
    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];         // To get a transpose, rows and columns are swapped.
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] arr) {
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));   // With the for each loop, matrices are print.
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 8, 9}, {7, 5, 12}};
        int[][] matrix2 = {{3, 4, 5, 16, 21}, {14, 3, 46, 31, 52}};

        System.out.println("Original matrix: ");
        printMatrix(matrix);
        System.out.println();

        System.out.println("Transpose of matrix:");
        printMatrix(transpose(matrix));
        System.out.println();

        System.out.println("Original matrix: ");
        printMatrix(matrix2);
        System.out.println();

        System.out.println("Transpose of matrix:");
        printMatrix(transpose(matrix2));
    }
}
