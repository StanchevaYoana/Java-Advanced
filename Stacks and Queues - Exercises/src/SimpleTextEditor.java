import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> changes = new ArrayDeque<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            switch (input[0]) {

                case "1":
                    changes.push(text.toString());
                    text.append(input[1]);
                    break;

                case "2":
                    int eraseCount = Integer.parseInt(input[1]);
                    if (text.length() >= eraseCount) {
                        changes.push(text.toString());
                        text.replace(text.length() - eraseCount, text.length() + 1, "");
                    }
                    break;

                case "3":
                    int index = Integer.parseInt(input[1]) - 1;
                    System.out.println(text.toString().charAt(index));
                    break;

                case "4":
                    if (!changes.isEmpty()) {
                        text.delete(0, text.length()).append(changes.pop());

                    }
                    break;
            }
        }

    }
}
