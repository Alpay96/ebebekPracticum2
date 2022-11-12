package week3;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int perlog = 3, balance = 1500, selection, price;
        String username, password;

        while (perlog > 0) {
            System.out.print("Enter your username: ");
            username = scan.nextLine();
            System.out.print("Enter your password: ");
            password = scan.nextLine();

            if (username.equals("alpay") && password.equals("alpay123")) {
                System.out.println("Hello and welcome to USTALAR bank.");

                do {
                    System.out.print("Please select the action you want to take: ");
                    System.out.println("\n1-To deposit money\n2-Withdraw money\n3-Balance inquiry\n4-Exit");
                    selection = scan.nextInt();

                    switch (selection) {
                        case 1 -> {
                            System.out.print("Amount to be deposited: ");
                            price = scan.nextInt();
                            balance += price;
                            System.out.println("Your transaction has been successfully completed. Would you like to take another action?");
                        }
                        case 2 -> {
                            System.out.print("Amount to be withdrawn: ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance!");
                            } else {
                                balance -= price;
                                System.out.println("Your transaction has been successfully completed. Would you like to take another action?");
                            }
                        }
                        case 3 -> System.out.println("Your balance: " + balance);
                        case 4 -> System.out.println("See you again");
                        default -> System.out.println("You have selected an invalid transaction!");
                    }
                } while (selection != 4);
                break;
            } else {
                perlog--;
                System.out.println("You made an incorrect entry! Try again.");
                if (perlog == 0) {
                    System.out.println("Your account has been blocked. Please contact to the bank.");
                } else System.out.println("Your remaining right: " + perlog);
            }
        }
    }
}
