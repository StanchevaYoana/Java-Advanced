import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numbersCount = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        for (String inputElements : input) {

            numbersCount.putIfAbsent(Double.parseDouble(inputElements),0);
            numbersCount.put(Double.parseDouble(inputElements), numbersCount.get(Double.parseDouble(inputElements)) + 1);
        }

        numbersCount.forEach((key, value) -> System.out.println(String.format("%.1f -> %d", key, value)));
    }
}
