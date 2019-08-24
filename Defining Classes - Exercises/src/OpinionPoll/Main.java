package OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OpinionPoll> pollList = new LinkedList<OpinionPoll>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            OpinionPoll poll = new OpinionPoll(data [0], Integer.parseInt(data [1]));
            pollList.add(poll);
        }

        pollList.stream().filter(person -> person.getAge() > 30).sorted(Comparator.comparing(OpinionPoll::getName))
                .forEach((person -> System.out.println(String.format("%s - %d", person.getName(),person.getAge()))));
    }
}
