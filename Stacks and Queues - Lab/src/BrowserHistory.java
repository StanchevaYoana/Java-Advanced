import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String input;
        while (!"Home".equals(input = scanner.nextLine())) {

            if (input.equals("back")) {
                if (stack.size() > 1) {
                    stack.pop();
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }

            } else {
                stack.push(input);
                System.out.println(input);
            }
        }
    }
}
