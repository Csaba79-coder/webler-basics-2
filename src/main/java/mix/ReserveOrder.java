package mix;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReserveOrder {

    static int[] nums = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversNums = reverseOrder(numbers);
        System.out.println(Arrays.toString(reversNums));
        int[] reversNumsAdam = reverseOrderAdam(numbers);
        System.out.println(Arrays.toString(reversNumsAdam));
        int[] reversNumsCsaba = reversOrderCsaba(numbers);
        System.out.println(Arrays.toString(reversNumsCsaba));
        System.out.println("---------------");
        int[] revNums = reverseOrder(nums);
        int[] revNums2 = reverseOrder(nums);
        System.out.println(Arrays.toString(revNums));
        System.out.println(Arrays.toString(revNums2));
    }

    private static int[] reverseOrder(int[] numbers) {
        int length = numbers.length;
        int[] reverseNumbers = new int[length];
        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverseNumbers[index] = numbers[i];
            index++;
        }
        return reverseNumbers;
    }

    private static int[] reverseOrderAdam(int[] numbers) {
        int length = numbers.length;
        int[] reverseNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            reverseNumbers[length - 1 - i] = numbers[i];
        }
        return reverseNumbers;
    }

    private static int[] reversOrderCsaba(int[] numbers) {
        int length = numbers.length;
        return IntStream.range(0, length)
                .map(index -> numbers[length - 1 - index])
                .toArray();
    }
}
