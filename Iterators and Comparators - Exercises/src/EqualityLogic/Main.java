package EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> personHashSet = new HashSet<>();
        Set<Person> personTreeSet = new TreeSet<>();

        int n = Integer.parseInt(read.readLine());

        while (n-- > 0) {
            String[] data = read.readLine().split("\\s+");

            Person person = new Person(data[0], Integer.parseInt(data[1]));

            personHashSet.add(person);
            personTreeSet.add(person);
        }
        System.out.println(personHashSet.size());
        System.out.println(personTreeSet.size());
    }
}

