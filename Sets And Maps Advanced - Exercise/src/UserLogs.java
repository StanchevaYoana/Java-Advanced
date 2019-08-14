import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> usersLog = new TreeMap<>();

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("IP=(?<ip>.*) message='.*' user=(?<user>.*)");

        while (!"end".equals(input)) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String ip = matcher.group("ip");
                String user = matcher.group("user");

                usersLog.putIfAbsent(user, new LinkedHashMap<>());
                usersLog.get(user).putIfAbsent(ip, 0);
                usersLog.get(user).put(ip, usersLog.get(user).get(ip) + 1);
                input = scanner.nextLine();
            }
        }

        usersLog.forEach((user, value) -> {
            System.out.println(user + ": ");
            StringBuilder output = new StringBuilder();
            for (Map.Entry<String, Integer> innerMap : value.entrySet()) {
                output.append(innerMap.getKey()).append(" => ").append(innerMap.getValue()).append(", ");
            }
            output = new StringBuilder(output.substring(0, output.length() - 2));
            output.append(".");
            System.out.println(output);
        });
    }
}
