package mix;

public class Factorial {

    public static void main(String[] args) {
        int fact = 5;
        int res = createFactorial(fact);
        System.out.println("A fakt: " + res);
    }

    private static int createFactorial(int fact) {
        /*int result = 1;
        if (fact <= 1) {
            return 1;
        } else {
            for (int i = 1; i <= fact; i++) {
                result *= i;
            }
            return result;
        }*/
        // neg fakt. nem lehet ...
        if (fact >= 0) {
            int result = 1;
            for (int i = 1; i <= fact; i++) {
                result *= i;
            }
            return result;
        }
        return -1;
    }
}
