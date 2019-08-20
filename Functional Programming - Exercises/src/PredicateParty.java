import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> collection = Arrays.stream(read.readLine().split("\\s+"))
                .collect(Collectors.toList());

        String string;
        while (!"Party!".equals(string = read.readLine())) {
            String[] tokens = string.split("\\s+");
            String command = tokens[0];
            String predicateType = tokens[1];
            String predicateArgument = tokens[2];

            if ("Remove".equals(tokens[0])) {
                collection.removeIf(getPredicate(predicateType, predicateArgument));
            } else if (command.equals("Double")) {

                for (int i = 0; i < collection.size(); i++) {
                    String guest = collection.get(i);
                    if (getPredicate(predicateType, predicateArgument).test(guest)) {
                        collection.add(i++, guest);
                    }
                }
            }
        }
        if (collection.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(collection);
            System.out.println(String.format("%s are going to the party!", String.join(", ", collection)));

        }
    }

    private static Predicate<String> getPredicate(String type, String parameter) {
        switch (type) {
            case "StartsWith":
                return text -> text.startsWith(parameter);
            case "EndsWith":
                return text -> text.endsWith(parameter);
            case "Length":
                return text -> text.length() == Integer.parseInt(parameter);
            default:
                return text -> false;
        }
    }
}

