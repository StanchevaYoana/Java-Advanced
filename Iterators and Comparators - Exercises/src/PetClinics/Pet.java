package PetClinics;

public class Pet {
    private String name;
    private Integer age;
    private String kind;

    public Pet(String name, Integer age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.kind;
    }
}
