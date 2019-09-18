package ComparingObjects;

public class Person implements Comparable<Person> {
    String name;
    int age;
    String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        if (this.name.compareTo(anotherPerson.name) == 0) {
            if (this.age == anotherPerson.age) {
                if (this.town.compareTo(anotherPerson.town) == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
