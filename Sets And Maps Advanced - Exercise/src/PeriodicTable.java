import java.util.*;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> elements = new TreeSet<>();

        while (n-- > 0) {
            elements.addAll(Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList()));
        }
        elements.forEach(element -> System.out.print(element + " "));
    }
}
