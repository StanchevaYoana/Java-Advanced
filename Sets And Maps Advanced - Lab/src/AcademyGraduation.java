import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentGrade = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String name = scanner.nextLine();
            List<Double> input = Arrays.stream(scanner.nextLine()
                    .split("\\s+")).map(Double::parseDouble)
                    .collect(Collectors.toList());

            studentGrade.putIfAbsent(name, new ArrayList<>());
            studentGrade.get(name).addAll(input);
        }

        studentGrade.forEach((key, value) -> {
            double sum = 0;
            for (Double grade : value) {
                sum += grade;
            }
            double avr = sum / value.size();

            System.out.println(String.format("%s is graduated with %s", key
                    , avr));
        });
    }
}