import java.util.Objects;

public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person otherPerson = (Person) obj;
        return this.getName().equals(((Person) obj).name) && this.getAge() == ((Person) obj).age;
    }

    @Override
    public int hashCode() {
        return getAge() * getName().hashCode();
    }
}



