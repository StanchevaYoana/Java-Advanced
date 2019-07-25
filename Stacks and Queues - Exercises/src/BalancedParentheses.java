import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque <String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length() ; i++) {
            char symbol = input.charAt(i);
            if (stack.isEmpty()){
                stack.push(String.valueOf(symbol));
            } else {
                boolean isEqual = false;
                switch (stack.peek()){
                    case "(":
                        if (symbol == ')'){
                            stack.pop();
                            isEqual = true;
                        }
                        break;
                    case "{":
                        if (symbol == '}'){
                            stack.pop();
                            isEqual = true;
                        }
                        break;
                    case "[":
                        if (symbol == ']'){
                            stack.pop();
                            isEqual = true;
                        }
                        break;
                }
                if (!isEqual){
                    stack.push(String.valueOf(symbol));
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
