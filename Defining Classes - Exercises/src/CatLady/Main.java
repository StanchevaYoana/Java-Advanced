package CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Cat> catMap = new HashMap<>();

        String input;
        while (!"End".equalsIgnoreCase(input = reader.readLine())) {
            String[] tokens = input.split("\\s+");
            String name = tokens[1];

            switch (tokens[0]) {
                case "Siamese":
                    Siamese siamese = new Siamese(tokens[0], Double.parseDouble(tokens[2]));
                    catMap.putIfAbsent(name, siamese);
                    break;
                case "Cymric":
                    Cymric cymric = new Cymric(tokens[0], Double.parseDouble(tokens[2]));
                    catMap.putIfAbsent(name, cymric);
                    break;
                case "StreetExtraordinaire":
                    StreetExtraordinaire street = new StreetExtraordinaire(tokens[0]
                            , Double.parseDouble(tokens[2]));
                    catMap.putIfAbsent(name, street);
                    ;
                    break;
            }

        }
        String cat = reader.readLine();

        if (catMap.containsKey(cat)) {
            System.out.println(String.format("%s %s %.2f",
                    catMap.get(cat).getName(),
                    cat,
                    catMap.get(cat).getSkillValue()));
        }
    }
}
