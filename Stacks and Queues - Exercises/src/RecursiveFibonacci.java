import java.util.Scanner;

public class RecursiveFibonacci {
    private static long[] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memory = new long[n + 1];

        long result = getFibbonachi(n);
        System.out.println(result);
    }

    private static long getFibbonachi(int n) {
        if (n < 2) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        return memory[n] = getFibbonachi(n - 1) + getFibbonachi(n - 2);
    }
}
