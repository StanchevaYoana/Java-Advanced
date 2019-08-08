import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
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

        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            String[] command = input.split(" ");
            if (!command[0].equals("swap") || command.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }
            int row1 = Integer.parseInt(command[1]);
            int col1 = Integer.parseInt(command[2]);
            int row2 = Integer.parseInt(command[3]);
            int col2 = Integer.parseInt(command[4]);

            if (row1 < r && row1 >= 0 && row2 < r && row2 >= 0 && col1 < c && col1 >= 0 && col2 < c && col2 >= 0) {

                int holder = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = holder;

                for (int[] ints : matrix) {
                    System.out.println(Arrays.toString(ints).replaceAll("[\\[\\],]", ""));
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
