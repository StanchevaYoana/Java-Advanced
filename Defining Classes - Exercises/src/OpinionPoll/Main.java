package OpinionPoll;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, OpinionPoll> opinionPollMap = new HashMap<String, OpinionPoll>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            int age = Integer.parseInt(data[1]);
            String name = data[0];
            OpinionPoll opinionPoll = new OpinionPoll();
            opinionPollMap.put(name, opinionPoll);
            opinionPollMap.get(name).setName(name);
            opinionPollMap.get(name).setAge(age);
        }

        opinionPollMap.entrySet().stream().filter(age -> age.getValue().getAge() > 30).sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach((key -> System.out.println(String.format("%s - %d", key.getKey(), key.getValue().getAge()))));

    }
}
