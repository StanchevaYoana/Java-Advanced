import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;


public class ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Consumer<String> consumer = System.out::println;

        Arrays.stream(read.readLine().split("\\s+")).forEach(consumer);
    }
}
