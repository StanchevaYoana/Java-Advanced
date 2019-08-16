import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = read.readLine().split(", ");
        UnaryOperator<Double> addVat = t -> 1.2 * t;
        System.out.println("Prices with VAT:");
        Arrays.stream(numbers).map(Double::parseDouble)
                .map(addVat).forEach(n -> System.out.printf("%.2f%n", n));

    }
}
