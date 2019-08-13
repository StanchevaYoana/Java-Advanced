import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentGrade = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            studentGrade.putIfAbsent(input[0], new ArrayList<>());
            studentGrade.get(input[0]).add(Double.parseDouble(input[1]));
        }

        studentGrade.forEach((student, grades) -> {

            String allGrades = grades.stream().map(g -> String.format("%.2f", g))
                    .collect(Collectors.joining(" "));

            Double avr = grades.stream().mapToDouble(e -> e).average().orElse(0d);
            System.out.println(String.format("%s -> %s (avg: %.2f)", student, allGrades, avr));
        });
    }
}
