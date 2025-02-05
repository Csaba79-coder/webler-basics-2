package exception;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // int result = 0;
        try {
            int result = 10/0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hiba -> nullával való osztás nem értelmezhető: " + e.getMessage());
            //System.out.println(e.getMessage());
        }
        //System.out.println("Result: " + result);
    }
}
