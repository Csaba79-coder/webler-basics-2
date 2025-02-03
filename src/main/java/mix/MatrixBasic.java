package mix;

public class MatrixBasic {

    public static void main(String[] args) {

        // Mátrix létrehozása
        int[][] matrix = {
                {10, 20, 30}, // martrix 0. indexén áll ez a belső (első) tömb -> azon belül elemek 0,1,2 -> elem [0][0] ez az első elem az 10
                {40, 50, 60}, // martrix 1. indexén áll ez a belső (második) tömb -> azon belül elemek 0,1,2 -> elem [1][0] ez az első elem az 40
                {70, 80, 90} // martrix 2. indexén áll ez a belső (harmadik) tömb -> azon belül elemek 0,1,2 -> elem [2][0] ez az első elem az 70
        };

        // System.out.println(matrix[1][1]); // 50
        // System.out.println(matrix[2][1]); // 80

        // Az első elemeinek és indexeinek kiírása
        System.out.println("Az első sor elemei:");
        for (int i = 0; matrix[0].length > i; i++) {
            System.out.println("Az " + i + ". elem: " + matrix[0][i]);
        }
    }
}
