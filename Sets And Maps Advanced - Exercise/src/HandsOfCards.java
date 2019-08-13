import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> players = new LinkedHashMap<>();

        String input;
        while (!"JOKER".equals(input = scanner.nextLine())) {
            String[] nameCards = input.split(": ");

            players.putIfAbsent(nameCards[0], new HashSet<>());
            players.get(nameCards[0]).addAll(Arrays.stream(nameCards[1].split(", ")).collect(Collectors.toList()));
        }

        Map<Character, Integer> cardValue = new HashMap<>();
        cardValue.put('C', 1);
        cardValue.put('D', 2);
        cardValue.put('H', 3);
        cardValue.put('S', 4);
        cardValue.put('J', 11);
        cardValue.put('Q', 12);
        cardValue.put('K', 13);
        cardValue.put('A', 14);

        Map<String, Integer> nameResult = new LinkedHashMap<>();

        for (Map.Entry<String, Set<String>> kvp : players.entrySet()) {
            nameResult.putIfAbsent(kvp.getKey(), 0);
            int sum = 0;
            for (String element : kvp.getValue()) {
                if (Character.isDigit(element.charAt(0)) && !Character.isDigit(element.charAt(1))) {
                    sum += (element.charAt(0) - 48) * cardValue.get(element.charAt(1));
                } else if (Character.isDigit(element.charAt(0)) && element.charAt(1) == '0') {
                    sum += 10 * cardValue.get(element.charAt(2));
                } else {
                    sum += cardValue.get(element.charAt(0)) * cardValue.get(element.charAt(1));
                }
            }
            nameResult.put(kvp.getKey(), sum);
        }
        nameResult.forEach((player, result) -> System.out.println(String.format("%s: %d", player, result)));
    }
}
