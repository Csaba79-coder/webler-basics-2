package exception;

public class ExceptionPropagationExample {

    public static void main(String[] args) {
        int dividend = 10;
        int divider = 0;
        try {
            divide(dividend, divider); // A kivételt itt fogjuk elkapni
        } catch (ArithmeticException e) {
            System.out.println("Az elkapott kivétel: " + e.getMessage());
        }

        createArrayIndexOutOfBound();
    }

    // Ez a metódus továbbdobja a kivételt
    private static void divide(int dividend, int divider) throws ArithmeticException {
        if (divider == 0) {
            throw new ArithmeticException("Nullával való osztás nem értelmezhető");
        }
        int res = dividend / divider;
        System.out.println("Eredmény: " + res);
    }

    private static void createArrayIndexOutOfBound() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
            //System.out.println("Hibás index: " + e.getMessage());
        } finally {
            System.out.println("Ez a finally blokk, mindig lefut!");
        }
    }
}
