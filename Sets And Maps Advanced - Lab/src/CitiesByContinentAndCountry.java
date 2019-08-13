import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, List<String>>> ccc = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            ccc.putIfAbsent(continent,new LinkedHashMap<>());
            ccc.get(continent).putIfAbsent(country, new ArrayList<>());
            ccc.get(continent).get(country).add(city);
        }

        ccc.forEach((key1, value1) -> {
            System.out.println(String.format("%s:", key1));
            value1.forEach((key, value) -> {
                System.out.print(String.format("%s -> ", key));
                System.out.print(value.toString()
                        .replaceAll("[\\[\\]]", ""));
                System.out.println();
            });
        });
    }
}
