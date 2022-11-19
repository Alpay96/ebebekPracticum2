package week4.SortingElementsInArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        int[] list;

        System.out.print("Size of the array: ");        // Dizi boyutu belirlenir.
        size = scan.nextInt();
        list = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". element : ");     // Belirlenen dizi boyutu kadar eleman kullanıcıdan alınır.
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);          // Küçükten büyüğe sıralama işlemi
        System.out.println("Sorting: " + Arrays.toString(list));    // Sıralanmış listeyi yazdırma
    }
}
