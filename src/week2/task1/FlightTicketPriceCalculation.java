package week2.task1;

import java.util.Scanner;

public class FlightTicketPriceCalculation {

    public static void main(String[] args) {
        int age, typeOfTravel;
        double km, normalPrice, childDiscount, youthDiscount, elderDiscount, discountedPrice;
        double perKm = 0.10, childDiscountRate = 0.50, youthDiscountRate = 0.10, elderDiscountRate = 0.30;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many kilometers will you fly?");
        km = scan.nextDouble();

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        System.out.println("Choose your type of travel: ");
        System.out.println("1 => One direction\n2 => Round-trip ");
        typeOfTravel = scan.nextInt();

        normalPrice = km * perKm;

        switch (typeOfTravel) {                     // Type of travel selection
            case 1:
                normalPrice = normalPrice;
                break;
            case 2:
                normalPrice *= 2 * 0.8;             // 20% discount for round trip tickets.
                break;
        }
        if ((age < 0) || (km < 0) || (typeOfTravel != 1) && (typeOfTravel != 2)) {  // Checking whether the values received from the user are valid.
            System.out.println("You entered incorrect data.");
        } else {
            if (age < 12) {
                childDiscount = normalPrice * childDiscountRate;    // Calculation of the child discount
                discountedPrice = normalPrice - childDiscount;      // Applying the child discount to the price
                System.out.println("Normal Price: " + normalPrice + "\nDiscounted price: " + discountedPrice);

            } else if (age <= 24) {
                youthDiscount = normalPrice * youthDiscountRate;    // Calculation of the youth discount
                discountedPrice = normalPrice - youthDiscount;      // Applying the youth discount to the price
                System.out.println("Normal Price: " + normalPrice + "\nDiscounted price: " + discountedPrice);

            } else if (age < 65)
                System.out.println("Your price is: " + normalPrice);

            else {
                elderDiscount = normalPrice * elderDiscountRate;    // Calculation of the elder discount
                discountedPrice = normalPrice - elderDiscount;      // Applying the elder discount to the price
                System.out.println("Normal Price: " + normalPrice + "\nDiscounted price: " + discountedPrice);
            }
        }
    }
}