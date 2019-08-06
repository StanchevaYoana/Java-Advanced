import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowCol = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder input = new StringBuilder();

        for (int row = 0; row < rowCol[0]; row++) {
            String[] currentInput = scanner.nextLine().split("\\s+");
            for (int i = 0; i < currentInput.length; i++) {
                input.append(currentInput[i]);
            }
        }
        int num = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowCol[0]][rowCol[1]];
        boolean noMatch = true;
        int counter = 0;
        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < rowCol[1]; col++) {
                int symbol = Character.getNumericValue(input.charAt(counter++));
                matrix[row][col] = symbol;
                if (symbol == num) {
                    System.out.printf("%d %d%n", row, col);
                    noMatch = false;
                }
            }
        }
        if (noMatch) {
            System.out.println("not found");
        }
    }
}
