package week4;

public class HarmonicAverage {
    public static double getHarmonicMean(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += 1 / (double) number;
        }
        return numbers.length / sum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9, 11};
        System.out.println("Harmonic Average: " + getHarmonicMean(numbers));
    }
}
