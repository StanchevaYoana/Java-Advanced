import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        String[][] matrix = new String[r][c];
        fillTheMatrix(matrix,r,c);
        printTheMatrix(matrix);

    }

    private static void printTheMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            System.out.println(Arrays.toString(strings).replaceAll("[\\[|\\],]", ""));
        }
    }

    private static void fillTheMatrix(String[][] matrix, int r, int c) {
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                matrix[row][col] = String.valueOf((char) (97 + row)) + (char) (97 + col + row) + (char) (97 + row);
            }
        }
    }
}
