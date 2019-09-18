package ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> personList = new ArrayList<>();

        String data;
        while (!"END".equals(data = reader.readLine())) {
            String[] tokens = data.split("\\s+");
            Person person1 = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            personList.add(person1);
        }
        int indexOfPerson = Integer.parseInt(reader.readLine()) - 1;

        int samePersons = 0;
        int notSame = 0;
        for (Person person : personList) {
            if (person.compareTo(personList.get(indexOfPerson)) == 0) {
                samePersons++;
            } else {
                notSame++;
            }
        }
        if (samePersons == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(String.format("%d %d %d", samePersons, notSame, personList.size()));
        }
    }
}
