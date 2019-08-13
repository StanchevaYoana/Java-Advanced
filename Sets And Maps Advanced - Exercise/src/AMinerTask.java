import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mine = new LinkedHashMap<>();

        String string;

        while (!"stop".equals(string = scanner.nextLine())) {
            mine.putIfAbsent(string,0);
            mine.put(string, mine.get(string) + scanner.nextInt());
            scanner.nextLine();
        }
        mine.forEach((element, quantity) -> {
            System.out.printf("%s -> %d%n", element, quantity);
        });
    }
}
