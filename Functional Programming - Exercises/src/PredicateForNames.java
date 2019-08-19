import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        Predicate<String> listPredicate = word -> word.length() <= n;

        Arrays.stream(read.readLine().split("\\s+")).filter(listPredicate).forEach(System.out::println);
    }
}
