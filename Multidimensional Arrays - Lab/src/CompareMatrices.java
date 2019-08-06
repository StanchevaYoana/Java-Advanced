import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dim = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();

        int[][] firstMatrix = new int[dim[0]][dim[1]];

        for (int[] ints : firstMatrix) {
            int[] nums = Arrays.stream(scanner.nextLine()
                    .split("\\s+")).mapToInt(Integer::parseInt)
                    .toArray();

            System.arraycopy(nums, 0, ints, 0, nums.length);
        }
        int[] dim2 = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();

        int[][] secondMatrix = new int[dim2[0]][dim2[1]];
        for (int[] ints : secondMatrix) {
            int[] nums = Arrays.stream(scanner.nextLine()
                    .split("\\s+")).mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(nums, 0, ints, 0, nums.length);
        }

        if (dim[0] != dim2[0]|| dim [1] != dim2 [1]) {
            System.out.println("not equal");
            return;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
