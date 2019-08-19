import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Consumer<List<Integer>> print = e -> e.forEach(n -> System.out.print(n + " "));

        List<Integer> nums = Arrays.stream(read.readLine()
                .split("\\s+")).mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toCollection(ArrayList::new));
        UnaryOperator<List<Integer>> multiply = list -> list.stream()
                .map(m -> m *= 2).collect(Collectors.toCollection(ArrayList::new));

        Function<List<Integer>, List<Integer>> add = list -> list.stream()
                .map(m -> ++m).collect(Collectors.toCollection(ArrayList::new));
        Function<List<Integer>, List<Integer>> subtract = list -> list.stream()
                .map(m -> --m).collect(Collectors.toCollection(ArrayList::new));

        String command;
        while (!"end".equals(command = read.readLine()))

            switch (command) {
                case "add":
                    nums = add.apply(nums);
                    break;
                case "subtract":
                   nums = subtract.apply(nums);
                    break;
                case "multiply":
                   nums = multiply.apply(nums);
                    break;
                case "print":
                    print.accept(nums);
                    System.out.println();
                    break;
            }
    }
}
