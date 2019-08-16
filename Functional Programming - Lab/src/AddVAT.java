import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double[] numbers = Arrays.stream(read.readLine()
                .split(", ")).mapToDouble(Double::parseDouble).toArray();


        UnaryOperator<Double> addVat = t -> t * 1.2;
        double[] vatIncluded = Arrays.stream(numbers).map(addVat::apply).toArray();
        System.out.println("Prices with VAT:");
        for (double num : vatIncluded) {
            System.out.printf("%.2f%n", num);
        }
    }
}
