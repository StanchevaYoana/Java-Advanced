import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = Arrays.stream(scanner.nextLine()
                .split(" ")).collect(Collectors.toCollection(ArrayDeque::new));

        while (stack.size() > 1) {
            int firstNum = Integer.parseInt(stack.pop());
            String sign = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            if (sign.equals("+")) {
                firstNum += secondNum;
            } else {
                firstNum -= secondNum;
            }
            stack.push(String.valueOf(firstNum));

        }
        System.out.println(stack.getFirst());
    }
}
