import java.util.*;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] in = scanner.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int s = Integer.parseInt(in[1]);
        int x = Integer.parseInt(in[2]);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        list.stream().limit(n).forEach(stack::push);

        while (s-- > 0) {
            stack.pop();
        }
        if (stack.contains(String.valueOf(x))) {
            System.out.println("true");
        } else {
            if (stack.size() == 0) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}
