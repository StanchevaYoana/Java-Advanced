import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> nameEmail = new LinkedHashMap<>();

        String input;

        while (!"stop".equals(input = scanner.nextLine())) {
            String email = scanner.nextLine();
            if (email.endsWith("bg")) {
                nameEmail.put(input, email);
            }
        }
        nameEmail.forEach((name, email) -> System.out.println(String.format("%s -> %s", name, email)));
    }
}
