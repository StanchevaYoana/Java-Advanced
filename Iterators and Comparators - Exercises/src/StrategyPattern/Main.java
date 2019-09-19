package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> nameComparator = new TreeSet<>(new CompareByName());
        Set<Person> ageComparator = new TreeSet<>(new CompareByAge());

        int num = Integer.parseInt(reader.readLine());

        while (num-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            nameComparator.add(person);
            ageComparator.add(person);
        }
        nameComparator.forEach(System.out::println);
        ageComparator.forEach(System.out::println);
    }
}
