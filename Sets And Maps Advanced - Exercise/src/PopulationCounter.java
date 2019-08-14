import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;


public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Long>> ccp = new HashMap<>();

        String input = scanner.nextLine();

        while (!"report".equals(input)) {
            String[] tokens = input.split("\\|");

            ccp.putIfAbsent(tokens[1], new HashMap<>());
            ccp.get(tokens[1]).putIfAbsent(tokens[0], 0L);
            ccp.get(tokens[1]).put(tokens[0], ccp.get(tokens[1]).get(tokens[0]) + Long.parseLong(tokens[2]));

            input = scanner.nextLine();
        }


        AtomicLong sum1 = new AtomicLong();
        AtomicLong sum2 = new AtomicLong();
        ccp.entrySet().stream().sorted((pair1, pair2) -> {

            sum1.set(0);
            sum2.set(0);

            pair1.getValue().forEach((key, value) -> sum1.addAndGet(value));
            pair2.getValue().forEach((key, value) -> sum2.addAndGet(value));

            int sort = Long.compare(sum2.get(), sum1.get());
            if (sort == 0) {
                sort = pair1.getKey().compareTo(pair2.getKey());
            }
            return sort;
        }).forEach(pair -> {

            sum1.set(0);

            pair.getValue().forEach((key, value) -> sum1.addAndGet(value));
            System.out.println(String.format("%s (total population: %d)", pair.getKey(), sum1.get()));

            pair.getValue().entrySet().stream().sorted((a, b) -> {
                int sort = b.getValue().compareTo(a.getValue());
                if (sort == 0) {
                    sort = a.getKey().compareTo(b.getKey());
                }
                return sort;
            }).forEach((key) -> System.out.println(String.format("=>%s: %d"
                    , key.getKey(), key.getValue())));
        });

    }
}
