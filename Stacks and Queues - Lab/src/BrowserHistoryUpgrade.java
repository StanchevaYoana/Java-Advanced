import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();

        String input;
        while (!"Home".equals(input = scanner.nextLine())) {

            if (input.equals("forward")) {
                if (queue.size() > 0) {
                    stack.push(queue.poll());
                    System.out.println(stack.peek());
                    queue.clear();
                } else {
                    System.out.println("no next URLs");
                }
            } else if (input.equals("back")) {
                if (stack.size() > 1) {
                    queue.offer(stack.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }

            } else {
                stack.push(input);
                queue.clear();
                System.out.println(input);
            }
        }
    }
}
