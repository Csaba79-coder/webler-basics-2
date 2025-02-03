package mix;

import java.util.Arrays;

public class StaticArrayExample {

    /*
    A nums statikus tömböt nem módosítjuk az első esetben.
    reverseOrder(nums) egy másolatot készít és azt fordítja meg.
    Az eredeti nums változatlan marad.
    A reverseOrderInPlace(nums) ténylegesen módosítja a statikus nums tömböt.
    Az utolsó hívás után az nums maga is megváltozik.
     */
    static int[] nums = {1, 2, 3, 4, 5}; // Statikus tömb

    public static void main(String[] args) {
        System.out.println("Eredeti nums: " + Arrays.toString(nums));

        // Készítünk egy másolatot és azt fordítjuk meg
        int[] reversedNums = reverseOrder(nums);
        System.out.println("Visszafordított tömb: " + Arrays.toString(reversedNums));

        // Az eredeti statikus nums nem változott meg!
        System.out.println("Eredeti nums változatlan: " + Arrays.toString(nums));

        // Most módosítjuk az eredeti nums tömböt is
        reverseOrderInPlace(nums);
        System.out.println("Eredeti nums módosítva: " + Arrays.toString(nums));
    }

    // Új tömb létrehozása és visszafordítása (nem módosítja az eredetit)
    private static int[] reverseOrder(int[] numbers) {
        int[] copy = Arrays.copyOf(numbers, numbers.length); // Másolat készítése
        for (int i = 0; i < copy.length / 2; i++) {
            int temp = copy[i];
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = temp;
        }
        return copy; // Új tömb visszaadása
    }

    // Az eredeti tömböt módosítja (statikus nums is változni fog)
    private static void reverseOrderInPlace(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
}

