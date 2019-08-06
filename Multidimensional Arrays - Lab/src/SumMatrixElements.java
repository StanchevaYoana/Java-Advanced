import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowCol = Arrays.stream(scanner.nextLine()
                .split("[,\\s+]+")).mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(rowCol[0]);
        System.out.println(rowCol[1]);
        int[][] matrix = new int[rowCol[0]][rowCol[1]];

        for (int[] ints : matrix) {
            int[] data = Arrays.stream(scanner.nextLine()
                    .split("[,\\s+]+")).mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(data, 0, ints, 0, data.length);
        }
        int sum = 0;
        for (int[] element : matrix) {
            sum += Arrays.stream(element).sum();
        }
        System.out.println(sum);
    }
}
