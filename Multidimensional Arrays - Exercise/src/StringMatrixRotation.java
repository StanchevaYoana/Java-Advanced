import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rotation = scanner.nextLine().split("[()]");

        List<String> input = new ArrayList<>();
        String in;
        while (!"END".equals(in = scanner.nextLine())) {
            input.add(in);
        }
        int c = 0;
        for (String s : input) {
            if (s.length() > c) {
                c = s.length();
            }
        }

        char[][] matrix = new char[input.size()][c];

        for (int row = 0; row < matrix.length; row++) {
            String word = input.get(row);
            for (int k = 0; k < matrix[row].length; k++) {
                if (k < word.length()) {
                    matrix[row][k] = word.charAt(k);
                } else {
                    matrix[row][k] = ' ';
                }
            }
        }

        int degrees = Integer.parseInt(rotation[1]) % 360;
        switch (degrees) {
            case 90:
                for (int col = 0; col < c; col++) {
                    for (int row = matrix.length -1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = matrix.length - 1; row >= 0; row--) {
                    for (int col = matrix[row].length - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = c-1; col >=0 ; col--) {
                    for (char[] chars : matrix) {
                        System.out.print(chars[col]);
                    }
                    System.out.println();
                }
                break;

            case 0:
                for (char[] chars : matrix) {
                    for (char aChar : chars) {
                        System.out.print(aChar);
                    }
                    System.out.println();
                }
        }
    }
}


