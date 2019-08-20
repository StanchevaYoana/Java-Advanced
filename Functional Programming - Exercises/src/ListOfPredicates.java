import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Set<Integer> collect = Arrays.stream(read.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        Predicate<Integer> predicate = number -> {
            for (Integer integer : collect) {
                if (number % integer != 0) {
                    return false;
                }
            }
            return true;
        };

        numbers.forEach(num -> {
            if (predicate.test(num)){
                System.out.print(num + " ");
            }
        });
    }
}

