package week3.task4;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int n = 2; n < i; n++) {   // Starting from 2, it is checked whether the remainder is 0 as a result of the division of all numbers except itself.
                if (i % n == 0) {
                    isPrime = false;        // If the remainder is zero, the number is not prime.
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + "  ");
            }
        }
    }
}
