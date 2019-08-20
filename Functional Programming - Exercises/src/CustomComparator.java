import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        nums.stream().sorted((a, b) -> {
            if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            } else {
                return a.compareTo(b);
            }
        }).forEach(num -> System.out.print(num + " "));
    }
}
