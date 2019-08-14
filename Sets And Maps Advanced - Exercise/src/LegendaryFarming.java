import java.util.*;

public class LegendaryFarming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        Map<String, Integer> junk = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean hasWinner = false;
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            String[] materials = input.split("\\s+");
            for (int i = 1; i <= materials.length; i += 2) {
                String material = materials[i];
                int quantity = Integer.parseInt(materials[i - 1]);
                if (keyMaterials.containsKey(material)) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");

                        }
                        hasWinner = true;
                        break;
                    }
                } else {
                    junk.putIfAbsent(material, 0);
                    junk.put(material, junk.get(material) + quantity);
                }
            }
            if (hasWinner) {
                break;
            }
        }

        keyMaterials.entrySet().stream().sorted((material1, material2) -> {
            int sort = material2.getValue().compareTo(material1.getValue());
            if (sort == 0) {
                sort = material1.getKey().compareTo(material2.getKey());
            }
            return sort;
        }).forEach((key) -> System.out.println(key.getKey() + ": " + key.getValue()));

        junk.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
