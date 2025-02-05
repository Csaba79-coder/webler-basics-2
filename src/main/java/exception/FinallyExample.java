package exception;

public class FinallyExample {

    // finally mindig lefut - kivétel, ha előtte a program leáll, vagy a System.exit() metódust hívjuk meg
    // JVM összeomlik (pl. OutOfMemoryError)
    // lefut a finally, ha try-ban eldobjuk, catchben elkapjuk!
    // nem fut le helyesen, ha nincs megfelelő catch ág!
    // finally blokkban nem lehet return utasítás, mert a return utasítás leállítja a metódust
    // mert! leáll a metódus, de lefut a finally, ha a finally blokkban van egy return utasítás
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hibás index: " + e.getMessage());
        } finally {
            System.out.println("Ez a finally blokk, mindig lefut!");
        }
        callAndPlayWithFinally();
        notRunFinally();
    }

    private static void callAndPlayWithFinally() {
        try {
            System.out.println("Try blokk fut...");
            throw new RuntimeException("Valami hiba történt!");
        } catch (RuntimeException e) {
            System.out.println("Catch blokk: " + e.getMessage());
        } finally {
            System.out.println("Finally blokk mindig lefut.");
        }
    }

    // mivel nincs megfelelő catch. igy elszáll a hibával! ... és a finally block lefut de a hibát eldobja!
    private static void notRunFinally() {
        try {
            System.out.println("Fut a try blokk, not run finally method ...");
            throw new RuntimeException("Valami hiba történt (not run finally");
        } finally {
            System.out.println("Finally blokk lefut a not run finally-ban?");
        }
    }
}
