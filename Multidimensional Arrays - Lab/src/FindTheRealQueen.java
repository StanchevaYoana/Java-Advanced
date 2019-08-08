import java.util.Scanner;

public class FindTheRealQueen {
    private static String queen = "q";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine()
                    .split("\\s+");
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals(queen)) {
                    if (isOnlyOne(matrix, row, col)) {
                        System.out.println(row + " " + col);
                        break;
                    }
                }
            }
        }
    }

    private static boolean isOnlyOne(String[][] matrix, int row, int col) {
        return (isQueenColumnValid(matrix, row)
                && isQueenRowValid(matrix, col)
                && lefTDiagonal(matrix, row, col)
                && rightDiagonal(matrix, row, col));
    }


    private static boolean isQueenColumnValid(String[][] matrix, int row) {
        int queenCount = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i].equals(queen)) {
                queenCount++;
            }
        }
        return queenCount == 1;
    }

    private static boolean isQueenRowValid(String[][] matrix, int col) {
        int queenCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col].equals(queen)) {
                queenCount++;
            }
        }
        return queenCount == 1;

    }

    private static boolean lefTDiagonal(String[][] matrix, int row, int col) {
        int queenCount = 0;
        for (int i = 0; row - i >= 0 && col - i >= 0; i++) {
            if (matrix[row - i][col - i].equals(queen)) {
                queenCount++;
            }
        }
        return queenCount == 1;
    }

    private static boolean rightDiagonal(String[][] matrix, int row, int col) {
        int queenCount = 0;
        for (int i = 0; row + i < 8 && col + i < 8; i++) {
            if (matrix[row + i][col + i].equals(queen)) {
                queenCount++;
            }
        }
        return queenCount == 1;
    }
}
