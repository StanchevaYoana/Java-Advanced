import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine()
                    .split("[,\\s+]+")).mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[] leftDiag = new int[n];
        for (int col = 0; col < n; col++) {
            int value = matrix[col][col];
            leftDiag[col] = value;
        }

        int[] rightDiag = new int[n];
        int row = n;

        for (int col = 0; col < n; col++) {
            int value = matrix[--row][col];
            rightDiag[col] = value;
        }

        System.out.println(Arrays.toString(leftDiag)
                .replaceAll("[\\[\\],]", ""));

        System.out.println(Arrays.toString(rightDiag)
                .replaceAll("[\\[\\],]", ""));
    }
}
