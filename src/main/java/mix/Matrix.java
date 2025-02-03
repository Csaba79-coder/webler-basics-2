package mix;

import java.util.Random;

public class Matrix {

    //public static int[][] matrixFromMatrix = new int[3][3];

    public static void main(String[] args) {

        int bound = 100;
        int row = 3;
        int column = 3;
        int[][] matrix = create(bound, row, column);
        // matrixFromMatrix = create(bound, row, column);
        // display(matrixFromMatrix);
        display(matrix);
    }

    private static int[][] create(int bound, int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(bound); // 0 - 99
            }
        }
        return matrix;
    }

    private static void display(int[][] matrix) {
        for (int[] nums: matrix) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println(); // ez csak a formázás miatt!!!
        }
        /*for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }*/
    }
}
