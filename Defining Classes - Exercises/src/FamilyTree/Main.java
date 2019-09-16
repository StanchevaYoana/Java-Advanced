package FamilyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = reader.readLine();
        Person person = new Person();

        if (firstLine.contains("/")) {
            person.setBirthday(firstLine);
        } else {
            person.setName(firstLine);
        }
        List<Person> personList = new ArrayList<>();

        Map<Person, List<Person>> nameParents = new HashMap<>();
        Map<Person, List<Person>> nameChildren = new HashMap<>();

        nameChildren.putIfAbsent(person, new ArrayList<>());
        nameParents.putIfAbsent(person, new ArrayList<>());

        String input;

        while (!"End".equalsIgnoreCase(input = reader.readLine())) {
            if (input.contains("-")) {
                String [] data = input.split(" - ");

            } else {
                String [] data = input.split("\\s+");
                Person person1 = new Person();
                person1.setName(data[0] + " " + data[1]);
                personList.add(person1);
            }

        }


    }


}
