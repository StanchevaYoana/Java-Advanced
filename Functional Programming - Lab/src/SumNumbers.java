import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] numbersString = read.readLine().split(", ");

        Function<String, Integer> function = Integer::parseInt;

        List<Integer> number = Arrays.stream(numbersString).map(function).collect(Collectors.toList());
        int sum = number.stream().reduce(0, Integer::sum);
        System.out.println("Count = " + number.size());
        System.out.println("Sum = " + sum);
    }
}
