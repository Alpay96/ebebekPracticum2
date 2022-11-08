package week2;

import java.util.Scanner;

public class AverageCalculation {

    public static void main(String[] args) {
        int math, physics, chemical, turkish, music, numberOfLessons = 0, totalGrade = 0;
        double average;

        Scanner scan = new Scanner(System.in);

        System.out.print("Your math grade: ");
        math = scan.nextInt();
        if (!(math <= 0 || math > 100)) {
            totalGrade += math;
            numberOfLessons++;
        }

        System.out.print("Your physics grade: ");
        physics = scan.nextInt();
        if (!(physics <= 0 || physics > 100)) {
            totalGrade += physics;
            numberOfLessons++;
        }

        System.out.print("Your chemical grade: ");
        chemical = scan.nextInt();
        if (!(chemical <= 0 || chemical > 100)) {
            totalGrade += chemical;
            numberOfLessons++;
        }

        System.out.print("Your turkish grade: ");
        turkish = scan.nextInt();
        if (!(turkish <= 0 || turkish > 100)) {
            totalGrade += turkish;
            numberOfLessons++;
        }

        System.out.print("Your music grade: ");
        music = scan.nextInt();
        if (!(music <= 0 || music > 100)) {
            totalGrade += music;
            numberOfLessons++;
        }

        average = totalGrade / numberOfLessons;


        if (average < 55) {
            System.out.println("Your grade average is: " + average);
            System.out.println("Fail the class");
        } else {
            System.out.println("Your grade average is: " + average);
            System.out.println("Congratulations! You passed the class.");
        }
    }
}
