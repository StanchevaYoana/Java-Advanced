import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer> firstNums = new LinkedHashSet<>();
        Set<Integer> secondNums = new LinkedHashSet<>();

        while (n-- > 0) {
            firstNums.add(scanner.nextInt());
        }
        while (m-- > 0) {
           secondNums.add(scanner.nextInt());
        }

        firstNums.retainAll(secondNums);
        firstNums.forEach(e-> System.out.print(e +" "));
    }
}
