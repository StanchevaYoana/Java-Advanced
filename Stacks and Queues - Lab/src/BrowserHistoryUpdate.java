import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stackBrowser = new ArrayDeque<>();
        ArrayDeque<String> queueBrowser = new ArrayDeque<>();

        String input;
        while (!"Home".equals(input = scanner.nextLine())) {

            if (input.equals("back")) {
                if (stackBrowser.size() > 1) {
                    queueBrowser.addFirst(stackBrowser.pop());
                    System.out.println(stackBrowser.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")){
                if (!queueBrowser.isEmpty()) {
                    stackBrowser.push(queueBrowser.peek());
                    System.out.println(queueBrowser.pop());
                } else {
                    System.out.println("no next URLs");
                }
            }else {
                stackBrowser.push(input);
                System.out.println(input);
                queueBrowser.clear();

            }
        }
        System.out.println();

    }
}
