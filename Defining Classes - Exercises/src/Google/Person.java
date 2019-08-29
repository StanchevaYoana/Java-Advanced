package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Car car;
    private Company company;
    private List<Parents> parentsList;
    private List<Children> childrenList;
    private List<Pokemon> pokemonList;


    public Person() {
        this.car = new Car();
        this.company = new Company();
        this.parentsList = new ArrayList<>();
        this.childrenList = new ArrayList<>();
        this.pokemonList = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public void addParents(Parents parents) {
        this.parentsList.add(parents);
    }

    public void addChildren(Children children) {
        this.childrenList.add(children);
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public Company getCompany() {
        return company;
    }

    public List<Parents> getParentsList() {
        return parentsList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

}
