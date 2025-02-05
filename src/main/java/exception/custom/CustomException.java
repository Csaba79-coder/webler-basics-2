package exception.custom;

// mi saját egyedi Exception, a neve pedig utaljon arra, amire akarjuk használni! (ha lehet, legyen minél generikusabb
public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}
