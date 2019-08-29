package PokemonTrainer;


import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int badges = 0;
    private List<Pokemon> pokemons;


    public Trainer() {
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }


    public void increaseBadges() {
        this.badges++;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getBadges() {
        return badges;
    }
}
