import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dim = Arrays.stream(scanner.nextLine()
                .split("[,\\s+]+")).mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dim[0]][dim[1]];

        for (int[] ints : matrix) {
            int[] nums = Arrays.stream(scanner.nextLine()
                    .split("[,\\s+]+")).mapToInt(Integer::parseInt)
                    .toArray();

            System.arraycopy(nums, 0, ints, 0, ints.length);
        }
        int[][] subMatrix = new int[2][2];
        int max = Integer.MIN_VALUE;

        for (int row = 1; row < matrix.length; row++) {
            int sum = 0;
            for (int col = 1; col < matrix[row].length; col++) {
                sum = matrix[row][col] + matrix[row][col - 1] + matrix[row - 1][col - 1] + matrix[row - 1][col];
                if (sum > max) {
                    max = sum;
                    subMatrix[0][0] = matrix[row - 1][col - 1];
                    subMatrix[0][1] = matrix[row - 1][col];
                    subMatrix[1][0] = matrix[row][col - 1];
                    subMatrix[1][1] = matrix[row][col];
                }
            }
        }
        for (int[] ints : subMatrix) {
            System.out.println(Arrays.toString(ints).replaceAll("[\\[\\],]", ""));
        }
        System.out.println(max);
    }
}