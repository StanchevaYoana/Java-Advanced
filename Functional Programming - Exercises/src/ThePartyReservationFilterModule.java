import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Predicate<String>> predicateMap = new HashMap<>();
        List<String> names = Arrays.stream(read.readLine().split("\\s+")).collect(Collectors.toList());

        String input;
        while (!"Print".equals(input = read.readLine())) {
            String[] tokens = input.substring(input.indexOf(";") + 1).split(";");
            String parameter = tokens[1];
            String name = tokens[0] + tokens[1];

            Predicate<String> predicate = null;
            if (input.contains("Add")) {
                switch (tokens[0]) {
                    case "Starts with":
                        predicate = str -> str.startsWith(parameter);
                        break;
                    case "Ends with":
                        predicate = str -> str.endsWith(parameter);
                        break;
                    case "Length":
                        predicate = str -> str.length() == Integer.parseInt(parameter);
                        break;
                    case "Contains":
                        predicate = str -> str.contains(parameter);
                        break;
                }
                predicateMap.putIfAbsent(name, predicate);


            } else {
                predicateMap.remove(name);
            }
        }
        for (String name : names) {
            boolean isValid = true;

            for (String predicateName : predicateMap.keySet()) {
                if (predicateMap.get(predicateName).test(name)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.print(name + " ");
            }
        }
    }
}
