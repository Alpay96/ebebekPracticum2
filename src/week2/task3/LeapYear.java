package week2.task3;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter an Year: ");
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))    // As a general rule, leap years are years that are a multiple of 4.
            System.out.println( year + " is a leap year");                  // Years that are a multiple of 100 are leap years only if they are divisible by 400 without a remainder.
        else                                                                // The reason why only those exactly divisible by 400 are considered ...
            System.out.println( year + " is not a leap year");              //...leap years is to correct the error that an astronomical year is approximately 365.242 days, not 365.25 days.
    }
}
