package week2;

import java.util.Scanner;

public class ActivitySuggestion {

    public static void main(String[] args) {

        int heat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the temperature.");
        heat = scan.nextInt();

        if (heat < 5) {
            System.out.println("You can go skiing.");
        } else if (heat > 5 && heat <= 15) {
            System.out.println("You can go cinema");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("You can have a picnic");
        } else {
            System.out.println("You can go swimming");
        }
    }
}