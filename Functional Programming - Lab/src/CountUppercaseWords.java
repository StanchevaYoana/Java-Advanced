import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("\\s+");
        Predicate<String> isUpperCase = word -> Character.isUpperCase(word.charAt(0));
        List<String> newList = Arrays.stream(input).filter(isUpperCase).collect(Collectors.toList());
        System.out.println(newList.size());
        System.out.println(String.join("\n", newList));
    }
}
