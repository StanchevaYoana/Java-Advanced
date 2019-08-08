import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[r][c];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                    .split(" ")).mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxSum = -1;
        int[] rowCol = new int[2];

        for (int row = 1; row < matrix.length - 1; row++) {
            for (int col = 1; col < matrix[row].length - 1; col++) {

                int sum = findSumOfSubMatrix(matrix, row, col);
                if (sum > maxSum) {
                    maxSum = sum;
                    rowCol[0] = row;
                    rowCol[1] = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int i = rowCol[0] - 1; i < rowCol[0] + 2; i++) {
            for (int j = rowCol[1] - 1; j < rowCol[1] + 2; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    private static int findSumOfSubMatrix(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int i = row - 1; i < row + 2; i++) {
            for (int j = col - 1; j < col + 2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
