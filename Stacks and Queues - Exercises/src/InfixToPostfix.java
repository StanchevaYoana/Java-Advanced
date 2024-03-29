import java.util.*;
import java.util.stream.Collectors;

public class InfixToPostfix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine()
                .split(" ")).collect(Collectors.toList());

        String postfix = inf2postFix(input.toString());
        List<String> output = new ArrayList<>();
        for (int i = 0; i < postfix.length(); i++) {
            output.add(String.valueOf(postfix.charAt(i)));
        }
        output.forEach(element -> {
            if (!element.equals(" ") && !element.equals(",")) {
                System.out.print(element + " ");
            }
        });
    }

    private static String inf2postFix(String infix) {

        StringBuilder postfix = new StringBuilder();
        ArrayDeque<Character> operator = new ArrayDeque<>();
        char popped;

        for (int i = 1; i < infix.length() - 1; i++) {

            char get = infix.charAt(i);

            if (!isOperator(get))
                postfix.append(get);

            else if (get == ')')
                while ((popped = operator.pop()) != '(')
                    postfix.append(popped);

            else {
                while (!operator.isEmpty() && get != '(' && precedence(operator.peek()) >= precedence(get))
                    postfix.append(operator.pop());

                operator.push(get);
            }
        }
        while (!operator.isEmpty())
            postfix.append(operator.pop());

        return postfix.toString();
    }

    private static boolean isOperator(char i) {
        return precedence(i) > 0;
    }

    private static int precedence(char i) {

        if (i == '(' || i == ')') return 1;
        else if (i == '-' || i == '+') return 2;
        else if (i == '*' || i == '/') return 3;
        else return 0;
    }
}

