import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Consumer<String> consumer = t -> System.out.println("Sir " + t);

        Arrays.stream(read.readLine().split("\\s+")).forEach(consumer);
    }
}
