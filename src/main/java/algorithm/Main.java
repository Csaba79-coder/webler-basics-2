package algorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        int[] result = filterEven(numbers);
        System.out.println(Arrays.toString(result));
    }

    private static int countEvenElement(int[] numbers) {
        int counter = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] filterEven(int[] numbers) {
        int[] result = new int[countEvenElement(numbers)];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
