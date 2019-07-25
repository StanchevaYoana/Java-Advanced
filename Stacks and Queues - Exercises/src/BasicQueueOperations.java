import java.util.*;
import java.util.stream.Collectors;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int s = input[1];
        int x = input[2];

        List<Integer> list = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        list.stream().limit(n).forEach(queue::add);

        while (s-- > 0) {
            queue.pop();
        }

        if (queue.size() == 0) {
            System.out.println(0);
        } else if (queue.contains(x)) {
            System.out.println(true);
        } else {
            System.out.println(queue.stream().min(Integer::compareTo).get());
        }
    }
}
