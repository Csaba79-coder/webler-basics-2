package exception;

public class MultipleCatchExample {

    public static void main(String[] args) {

        try {
            String txt = "";
            System.out.println("A szöveg hossza: " + txt.length());
            //String text = null;
            // System.out.println("A szöveg hossza: " + text.length()); // NullPointerException
            int res = 100 / txt.length();
            System.out.println("Res ..." + res);
        } catch (NullPointerException e) {
            System.out.println("Null értéken próbáltunk műveletet végezni! Hiba: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Általános hiba történt: " + e.getMessage());
        }
    }
}
