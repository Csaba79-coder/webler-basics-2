package mix;

public class Fibonacci {

    // 0 1 1 2 3 5 8 13 21 ...
    // mindig az előző két szám összege ...
    public static void main(String[] args) {
        int size = 10;
        createFibonacci(size);
        System.out.println("------------");
        int res = getElementOfFibonacci(size);
        System.out.print(res + " ");
        System.out.println("------------");
        int[] fibSeries = create(size);
        for (int num: fibSeries) {
            System.out.print(num + " ");
        }
    }

    private static void createFibonacci(int size) {
        int numPrevious = 0;
        int numCurrent = 1;
        for (int i = 0; i < size; i++) {
            System.out.print(numPrevious + " ");
            int numNext = numPrevious + numCurrent;
            numPrevious = numCurrent;
            numCurrent = numNext;
        }
    }

    private static int getElementOfFibonacci(int element) { // ez visszaadja
        if (element <= 0) {
            return 0;
        }
        int previous = 0;
        int current = 1;
        if (element == 1) {
            return previous;
        }
        for (int i = 2; i < element; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    private static int[] create(int size) {
        // 0 1 1 2 3 5 8 13 21 34
        int[] fibNums = new int[size];
        if (size >= 1) {
           fibNums[0] = 0;
        }
        if (size >= 2) {
            fibNums[1] = 1;
        }
        for (int i = 2; i < size; i++) {
            fibNums[i] = fibNums[i - 1] + fibNums[i - 2]; // 2-es elem = 1es és a 0.elem 3-as elem egyenlő 2-es + 1-es stb
        }
        return fibNums;
    }
}
