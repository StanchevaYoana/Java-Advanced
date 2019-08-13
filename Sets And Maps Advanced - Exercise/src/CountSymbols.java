import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> symbolCount = new TreeMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            symbolCount.putIfAbsent(input.charAt(i), 0);
            symbolCount.put(input.charAt(i), symbolCount.get(input.charAt(i)) + 1);
        }

        symbolCount.forEach((symbol, count) ->
                System.out.println(String.format("%c: %d time/s", symbol, count)));
    }
}
