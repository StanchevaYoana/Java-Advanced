package PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        Map<String, Trainer> trainerList = new LinkedHashMap<>();
        while (!"Tournament".equalsIgnoreCase(string = reader.readLine())) {

            String[] tokens = string.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(element, health);
            trainerList.putIfAbsent(trainerName, new Trainer());
            trainerList.get(trainerName).addPokemon(pokemon);

        }

        String input;

        while (!"End".equalsIgnoreCase(input = reader.readLine())) {
            for (Map.Entry<String, Trainer> kvp : trainerList.entrySet()) {
                if (kvp.getValue().getPokemons().size() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : kvp.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(input)) {
                            havePokemon = true;
                            kvp.getValue().increaseBadges();
                            break;
                        }
                    }
                    if (!havePokemon) {
                        for (Pokemon pokemon : kvp.getValue().getPokemons()) {
                            pokemon.decreaseHealth();
                            if (pokemon.getHealth() <= 0) {
                                kvp.getValue().getPokemons().remove(pokemon);
                                if (kvp.getValue().getPokemons().size() < 1) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        trainerList.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getBadges(), b1.getValue().getBadges()))
                .forEach(t -> {
                    System.out.println(String.format("%s %s %s", t.getKey(),
                            t.getValue().getBadges(),
                            t.getValue().getPokemons().size()));
                });
    }
}