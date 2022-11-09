package week2.task2;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter date of birth (in years): ");
        int year = scan.nextInt();

        switch (year % 12) {
            case 0 -> System.out.println("Your Chinese Zodiac Horoscope: Monkey");
            case 1 -> System.out.println("Your Chinese Zodiac Horoscope: Rooster");
            case 2 -> System.out.println("Your Chinese Zodiac Horoscope: Dog");
            case 3 -> System.out.println("Your Chinese Zodiac Horoscope: Pig");
            case 4 -> System.out.println("Your Chinese Zodiac Horoscope: Rat");
            case 5 -> System.out.println("Your Chinese Zodiac Horoscope: Ox");
            case 6 -> System.out.println("Your Chinese Zodiac Horoscope: Tiger");
            case 7 -> System.out.println("Your Chinese Zodiac Horoscope: Rabbit");
            case 8 -> System.out.println("Your Chinese Zodiac Horoscope: Dragon");
            case 9 -> System.out.println("Your Chinese Zodiac Horoscope: Snake");
            case 10 -> System.out.println("Your Chinese Zodiac Horoscope: Horse");
            case 11 -> System.out.println("Your Chinese Zodiac Horoscope: Sheep");
        }
    }
}