package week2;

import java.util.Scanner;

public class LoginControl {

    public static void main(String[] args) {

        String userName, password, newPassword;
        Scanner scan = new Scanner(System.in);
        System.out.print("User Name: ");
        userName = scan.nextLine();
        System.out.print("Password: ");
        password = scan.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))) {
            System.out.println("Login successful!");
        } else {

            System.out.println("Your username or password is incorrect.");
            int select;
            System.out.println("Would you like to reset your password? \n To reset \n Press '1' for yes Press '2' for no");
            select = scan.nextByte();

            switch (select) {
                case 1:
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Enter new password:");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.println("The new password cannot be the same as the old one");
                    } else {
                        System.out.println("Password successfully created.");
                    }
                    break;
                case 2:
                    System.out.println("Password reset failed.");
                    break;
            }
        }
    }
}