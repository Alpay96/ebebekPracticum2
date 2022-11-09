package week2;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int day;
        String month;
        Scanner scan = new Scanner(System.in);

        System.out.print("Doğduğunuz ay (Örnek: 'ocak' veya 'OCAK'): ");
        month = scan.nextLine();
        System.out.print("Doğduğunuz gün: ");
        day = scan.nextInt();

        if (month.equals("ocak") || month.equals("OCAK") ) {
            if (day <= 21 && day >= 1) {
                System.out.println("Oğlak burcu");
            } else if (day >= 22 && day <= 31)
                System.out.println("Kova burcu");

        }
        if (month.equals("şubat") || month.equals("ŞUBAT")) {
            if (day <= 19 && day >= 1) {
                System.out.println("Kova burcu");
            } else if (day >= 20 && day <= 29)
                System.out.println("Balık burcu");

        }
        if (month.equals("mart") || month.equals("MART")) {
            if (day <= 20 && day >= 1) {
                System.out.println("Balık burcu");
            } else if (day >= 21 && day <= 31)
                System.out.println("Koç burcu");

        }
        if (month.equals("nisan") || month.equals("NİSAN")) {
            if (day <= 20 && day >= 1) {
                System.out.println("Koç burcu");
            } else if (day >= 21 && day <= 30)
                System.out.println("Boğa burcu");

        }
        if (month.equals("mayıs") || month.equals("MAYIS")) {
            if (day <= 21 && day >= 1) {
                System.out.println("Boğa burcu");
            } else if (day >= 22 && day <= 31)
                System.out.println("İkizler burcu");

        }
        if (month.equals("haziran") || month.equals("HAZİRAN")) {
            if (day <= 22 && day >= 1) {
                System.out.println("İkizler burcu");
            } else if (day >= 23 && day <= 30)
                System.out.println("Yengeç burcu");

        }
        if (month.equals("temmuz") || month.equals("TEMMUZ")) {
            if (day <= 22 && day >= 1) {
                System.out.println("Yengeç burcu");
            } else if (day >= 23 && day <= 31)
                System.out.println("Aslan burcu");

        }
        if (month.equals("ağustos") || month.equals("AĞUSTOS")) {
            if (day <= 22 && day >= 1) {
                System.out.println("Aslan burcu");
            } else if (day >= 23 && day <= 30)
                System.out.println("Başak burcu");

        }
        if (month.equals("eylül") || month.equals("EYLÜL")) {
            if (day <= 22 && day >= 1) {
                System.out.println("Başak burcu");
            } else if (day >= 23 && day <= 31)
                System.out.println("Terazi burcu");

        }
        if (month.equals("ekim") || month.equals("EKİM")) {
            if (day <= 22 && day >= 1) {
                System.out.println("Terazi burcu");
            } else if (day >= 23 && day <= 30)
                System.out.println("Akrep burcu");

        }
        if (month.equals("kasım") || month.equals("KASIM")) {
            if (day <= 21 && day >= 1) {
                System.out.println("Akrep burcu");
            } else if (day >= 22 && day <= 31)
                System.out.println("Yay burcu");

        }
        if (month.equals("aralık") || month.equals("ARALIK")) {
            if (day <= 21 && day >= 1) {
                System.out.println("Yay burcu");
            } else if (day >= 22 && day <= 30)
                System.out.println("Oğlak burcu");
        }
    }
}
