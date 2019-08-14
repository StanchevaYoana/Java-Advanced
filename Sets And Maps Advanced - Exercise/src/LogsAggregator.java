import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> userTime = new TreeMap<>();
        Map<String, Set<String>> userIp = new TreeMap<>();
        while (n-- > 0) {
            String [] input = scanner.nextLine().split("\\s+");

            String user = input [1];
            String ip = input [0];
            int duration = Integer.parseInt(input[2]);

            userTime.putIfAbsent(user, 0);
            userTime.put(user, userTime.get(user)+ duration);

            userIp.putIfAbsent(user, new TreeSet<>());
            userIp.get(user).add(ip);
        }

        userTime.forEach((user,time) ->{
            System.out.print(user+": " + time+" ");
            System.out.println(userIp.get(user));
        });
    }
}
