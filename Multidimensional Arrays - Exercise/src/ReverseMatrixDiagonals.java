import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine()
                    .split(" ")).mapToInt(Integer::parseInt)
                    .toArray();
        }
        int i;
        int j;

        for (int k = col - 1; k > 0; k--) {
            i = row - 1;
            j = k;

            while (j < col && i >=0) {
                System.out.print(matrix[i][j] + " ");
                i = i - 1;
                j = j + 1;
            }
            System.out.println();
        }
        for (int k = row - 1; k >= 0; k--) {
            i = k;
            j = 0;

            while (i >= 0 && j < col) {
                System.out.print(matrix[i][j] + " ");
                i = i - 1;
                j = j + 1;

            }
            System.out.println();
        }
    }
}
