import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, int[]>> dragons = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            dragons.putIfAbsent(input[0], new TreeMap<>());
            dragons.get(input[0]).putIfAbsent(input[1], new int[3]);

            if (input[2].equals("null")) {
                dragons.get(input[0]).get(input[1])[0] = 45;
            } else {
                dragons.get(input[0]).get(input[1])[0] = Integer.parseInt(input[2]);
            }
            if (input[3].equals("null")) {
                dragons.get(input[0]).get(input[1])[1] = 250;
            } else {
                dragons.get(input[0]).get(input[1])[1] = Integer.parseInt(input[3]);
            }
            if (input[4].equals("null")) {
                dragons.get(input[0]).get(input[1])[2] = 10;
            } else {
                dragons.get(input[0]).get(input[1])[2] = Integer.parseInt(input[4]);
            }
        }

        dragons.forEach((key1, value) -> {
            double avgDam = 0;
            double avgHealth = 0;
            double avgArmor = 0;
            for (Map.Entry<String, int[]> innerMap : value.entrySet()) {
                avgDam += innerMap.getValue()[0];
                avgHealth += innerMap.getValue()[1];
                avgArmor += innerMap.getValue()[2];
            }
            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", key1, avgDam / value.entrySet().size(), avgHealth / value.entrySet().size(), avgArmor / value.entrySet().size()));

            value.forEach((key, value1) -> System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d"
                    , key,
                    value1[0],
                    value1[1],
                    value1[2])));
        });
    }
}

