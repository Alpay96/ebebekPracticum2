package week2;
import java.util.Scanner;
public class NumberSorting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("number1: ");
        int number1 = scan.nextInt();

        System.out.print("number2: ");
        int number2 = scan.nextInt();

        System.out.print("number3: ");
        int number3 = scan.nextInt();

        if ((number1 < number2) && (number1 < number3)) {
            if (number2 < number3) {
                System.out.println("number1 < number2 < number3");
            } else
                System.out.println("number1 < number3 < number2");

        } else if ((number2 < number1) && (number2 < number3)) {
            if (number1 < number3) {
                System.out.println("number2 < number1 < number3");
            } else
                System.out.println("number2 < number3 < number1");

        } else if ((number3 < number1) && (number3 < number2)) {
            if (number1 < number2) {
                System.out.println("number3 < number1 < number2");
            } else
                System.out.println("number3 < number2 < number1");

        } else
            System.out.println("Numbers are equal each other.");
    }
}