package Java101.Arrays;

public class HarmonicArrayAverage {
    public static void main(String[]args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }
        System.out.println(numbers.length / sum);
    }
}
