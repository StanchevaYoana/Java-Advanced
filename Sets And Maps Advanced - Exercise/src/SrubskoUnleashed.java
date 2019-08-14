import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrubskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(?<artist>.*) @(?<place>.*) (?<tickets>\\d*) (?<price>\\d*)");

        String string;

        Map<String, Map<String, Long>> placeArtistMoney = new LinkedHashMap<>();

        while (!"End".equals(string = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(string);

            if (matcher.find()) {
                String artist = matcher.group("artist");
                String place = matcher.group("place");
                int tickets = Integer.parseInt(matcher.group("tickets"));
                long income = tickets * Long.parseLong(matcher.group("price"));

                placeArtistMoney.putIfAbsent(place, new LinkedHashMap<>());
                placeArtistMoney.get(place).putIfAbsent(artist, 0L);
                long value = placeArtistMoney.get(place).get(artist) + income;
                placeArtistMoney.get(place).put(artist, value);
            }
        }

        placeArtistMoney.forEach((place, value) -> {
            System.out.println(place);
            value.entrySet().stream().sorted((artist1, artist2) -> {
                return artist2.getValue().compareTo(artist1.getValue());
            }).forEach(key -> System.out.println(String.format("#  %s -> %d", key.getKey(), key.getValue())));

        });
    }
}