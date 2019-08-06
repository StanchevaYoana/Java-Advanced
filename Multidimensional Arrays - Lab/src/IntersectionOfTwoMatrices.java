import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsCount = Integer.parseInt(scanner.nextLine());
        int colCount = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[rowsCount][colCount];
        char[][] secondMatrix = new char[rowsCount][colCount];
        char[][] thirdMatrix = new char[rowsCount][colCount];

        for (int row = 0; row < firstMatrix.length; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < input.length; col++) {
                firstMatrix[row][col] = input[col].charAt(0);
            }
        }

        for (int row = 0; row < secondMatrix.length; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < input.length; col++) {
                secondMatrix[row][col] = input[col].charAt(0);
            }
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                char firstChar = firstMatrix[row][col];
                char secondChar = secondMatrix[row][col];
                if (firstChar == secondChar) {
                    thirdMatrix[row][col] = firstChar;
                } else {
                    thirdMatrix[row][col] = '*';
                }
            }
        }

        for (char[] element : thirdMatrix) {
            System.out.println(Arrays.toString(element).replaceAll("[\\[\\],]", ""));
        }
    }
}
