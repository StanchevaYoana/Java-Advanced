import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> people = new LinkedHashMap<>();
        BiPredicate<Map.Entry<String, Integer>, Integer> youngerThen = (person, ageLimit) -> person.getValue() <= ageLimit;
        BiPredicate<Map.Entry<String, Integer>, Integer> olderThen = (person, ageLimit) -> person.getValue() >= ageLimit;

        Consumer<Map.Entry<String, Integer>> printName = person -> System.out.println(person.getKey());
        Consumer<Map.Entry<String, Integer>> printAge = person -> System.out.println(person.getValue());
        Consumer<Map.Entry<String, Integer>> printNameAge = person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());

        int n = Integer.parseInt(read.readLine());

        while (n-- > 0) {
            String[] input = read.readLine().split(", ");
            people.put(input[0], Integer.parseInt(input[1]));
        }
        String comparison = read.readLine();
        int ageLimit = Integer.parseInt(read.readLine());
        String printType = read.readLine();
        people.entrySet().stream().filter(person -> comparison.equals("younger") ?
                youngerThen.test(person, ageLimit) :
                olderThen.test(person, ageLimit)
        ).forEach(person -> {
            if (printType.equals("name")) {
                printName.accept(person);
            } else if (printType.equals("age")) {
                printAge.accept(person);
            } else {
                printNameAge.accept(person);
            }
        });
    }
}
