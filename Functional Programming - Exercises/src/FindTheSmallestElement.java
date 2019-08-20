import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Function<List<Integer>, Integer> findSmallest = list -> {
            return list.stream().min(Integer::compareTo).get();
        };

        List<Integer> numbers = Arrays.stream(read.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(numbers.lastIndexOf(findSmallest.apply(numbers)));
    }
}


