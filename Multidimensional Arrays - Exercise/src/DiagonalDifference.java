import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                    .split(" ")).mapToInt(Integer::parseInt)
                    .toArray();

        }

        int sum  = Math.abs(sumOfLeftDiagonal(matrix) - sumOfRightDiagonal(matrix));
        System.out.println(sum);

    }

    private static int sumOfRightDiagonal(int[][] matrix) {
        int sum = 0;
        int col = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            sum += matrix[i][col++];
        }
        return sum;
    }

    private static int sumOfLeftDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}

