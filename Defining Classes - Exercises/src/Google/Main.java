package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> personMap = new LinkedHashMap<>();

        String input;
        while (!"End".equalsIgnoreCase(input = reader.readLine())) {

            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String command = tokens[1];
            personMap.putIfAbsent(name, new Person());

            switch (command) {
                case "company":
                    Company company = new Company();
                    company.setCompanyName(tokens[2]);
                    company.setDepartment(tokens[3]);
                    company.setSalary(Double.parseDouble(tokens[4]));
                    personMap.get(name).setCompany(company);

                    break;
                case "car":
                    Car car = new Car();
                    car.setCarModel(tokens[2]);
                    car.setCarSpeed(Integer.parseInt(tokens[3]));
                    personMap.get(name).setCar(car);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(tokens[2], tokens[3]);
                    personMap.get(name).addPokemon(pokemon);
                    break;
                case "parents":
                    Parents parents = new Parents(tokens[2], tokens[3]);
                    personMap.get(name).addParents(parents);
                    break;
                case "children":
                    Children children = new Children(tokens[2], tokens[3]);
                    personMap.get(name).addChildren(children);
                    break;

            }
        }
        String person = reader.readLine();
        if (personMap.containsKey(person)) {
            System.out.println(person);
            System.out.println("Company:");
            if (personMap.get(person).getCompany().getCompanyName() != null) {
                System.out.println(String.format("%s %s %.2f", personMap.get(person).getCompany().getCompanyName()
                        , personMap.get(person).getCompany().getDepartment(), personMap.get(person).getCompany().getSalary()));

            }
            System.out.println("Car:");
            if (personMap.get(person).getCar().getCarModel() != null) {
                System.out.println(String.format("%s %d", personMap.get(person).getCar().getCarModel()
                        , personMap.get(person).getCar().getCarSpeed()));
            }
            System.out.println("Pokemon:");

            if (personMap.get(person).getPokemonList().size() > 0) {
                for (Pokemon pokemon : personMap.get(person).getPokemonList()) {
                    System.out.println(String.format("%s %s", pokemon.getPokemonName(), pokemon.getPokemonType()));
                }
            }
            System.out.println("Parents:");
            if (personMap.get(person).getParentsList().size() > 0) {
                for (Parents parents : personMap.get(person).getParentsList()) {
                    System.out.println(String.format("%s %s", parents.getParentName(), parents.getParentBirthday()));
                }
            }
            System.out.println("Children:");
            if (personMap.get(person).getChildrenList().size() > 0) {
                for (Children children : personMap.get(person).getChildrenList()) {
                    System.out.println(String.format("%s %s", children.getChildName(), children.getChildBirthday()));
                }
            }
        }
    }
}

