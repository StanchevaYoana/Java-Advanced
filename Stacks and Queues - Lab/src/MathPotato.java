import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (IsPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.pop());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.pop());
    }

    private static boolean IsPrime(int n) {
        boolean primeCheck = true;
        if (n == 0 || n == 1) {
            primeCheck = false;
            return primeCheck;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primeCheck = false;
                }
            }
            return primeCheck;
        }
    }
}
