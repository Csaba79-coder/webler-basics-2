package exception;

import exception.custom.CustomException;
import exception.custom.CustomException2;

public class CustomExceptionExample {

    public static void main(String[] args) {
        int number = -5;
        try {
            checkNumber(number);
        } catch (CustomException e) {
            System.out.println("Saját kivétel elkapva: " + e.getMessage());
        }

        try {
            throwException();
        } catch (CustomException2 e) {
            //System.out.println("Saját runtime kivétel elkapva: " + e.getMessage());
            e.printStackTrace(System.out);
        }

    }

    // CustomException, ennnek olyan nevet adunk, ami beszédes! -> NegativeNumberException
    private static void checkNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("A szám nem lehet negatív!");
        }
    }

    private static void throwException() {
        throw new CustomException2("Ez egy unchecked kivétel! ... 2-esből");
    }
}
