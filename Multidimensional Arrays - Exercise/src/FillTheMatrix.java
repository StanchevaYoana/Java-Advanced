import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(", ");
        int size = Integer.parseInt(in[0]);

        int[][] matrix = new int[size][size];

        if (in[1].equals("A")) {
            fillTheMatrixA(matrix);
        } else {
            fillTheMatrixB(matrix);
        }

        printTheMatrix(matrix);
    }

    private static void fillTheMatrixB(int[][] matrix) {
        int value = 1;

        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = value++;
                }

            } else {
                for (int row = matrix[col].length - 1; row >= 0; row--) {
                    matrix[row][col] = value++;
                }
            }
        }
    }

    private static void printTheMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints).replaceAll("[\\[|\\]|,]", ""));
        }

    }

    private static void fillTheMatrixA(int[][] matrix) {

        int value = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = value++;
            }
        }
    }
}

