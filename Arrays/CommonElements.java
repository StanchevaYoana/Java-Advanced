import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstRow = scanner.nextLine().split(" ");
        String[] secondRow = scanner.nextLine().split(" ");

        for (int i = 0; i < secondRow.length; i++) {
            String n = secondRow[i];
            for (int j = 0; j < firstRow.length; j++) {
                String f = firstRow[j];

                if (n.equals(f)) {
                    System.out.print(n);
                    System.out.print(" ");

                }
            }

        }

    }
}
