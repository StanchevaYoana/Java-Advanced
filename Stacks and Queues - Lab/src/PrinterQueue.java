import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queues = new ArrayDeque<>();

        String input;
        while (!"print".equals(input = scanner.nextLine())) {
            if ("cancel".equals(input)) {
                if (queues.size() > 0) {
                    System.out.println("Canceled " + queues.pollFirst());
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                queues.offer(input);
            }
        }
        queues.forEach(e -> System.out.println(queues.pollFirst()));
    }
}
