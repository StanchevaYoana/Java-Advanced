import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<List<Integer>> print = list -> list.forEach(num -> System.out.print(num + " "));

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbers);
        numbers = numbers.stream()
                .filter(e -> e % n != 0).collect(Collectors.toCollection(ArrayList::new));

        print.accept(numbers);
    }
}
