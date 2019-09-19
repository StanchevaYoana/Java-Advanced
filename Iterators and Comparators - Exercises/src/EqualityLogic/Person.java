package EqualityLogic;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            return this.name.equals(((Person) obj).name) && this.age.equals(((Person) obj).age);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age.hashCode();
    }

    @Override
    public int compareTo(Person o) {
        if (this.getName().compareTo(o.getName()) == 0) {
            return this.getAge() - o.getAge();
        }
        return this.getName().compareTo(o.getName());
    }
}

