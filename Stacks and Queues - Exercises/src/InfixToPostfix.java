import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> numbers = new ArrayDeque<>(); // queue
        ArrayDeque<String> operators = new ArrayDeque<>();//stack

        String[] input = scanner.nextLine().split(" ");
        String operatorBetweenBrackets = "";
        boolean openBrackets = false;

        for (String n : input) {
            char symbol = n.charAt(0);
            if (Character.isDigit(symbol) || Character.isAlphabetic(symbol)) {
                numbers.offer(n);
            } else if (symbol == '+' || symbol == '-'){
                if (!operators.isEmpty() && operators.peek().equals(String.valueOf(symbol))) {
                    numbers.offer(operators.peek());
                } else if (openBrackets) {
                    operatorBetweenBrackets = String.valueOf(symbol);
                } else {
                    operators.push(String.valueOf(symbol));
                }
            } else if (symbol == '*' || symbol == '/') {
                if (operators.contains("*")|| operators.contains("/")) {

                } else if (openBrackets) {
                    operatorBetweenBrackets = String.valueOf(symbol);
                } else {
                    operators.push(String.valueOf(symbol));
                }
            }else if (symbol == '(') {
                openBrackets = true;
            } else if (symbol == ')') {
                openBrackets = false;
                numbers.offer(operatorBetweenBrackets);
            }
        }
        numbers.forEach(element -> System.out.print(element + " "));
        operators.forEach(element -> System.out.print(element + " "));
    }
}

