package CatLady;

public abstract class Cat {
    String name;
    double skillValue;


    public Cat(String name, double skillValue) {
        this.name = name;
        this.skillValue = skillValue;
    }


    public String getName() {
        return name;
    }

    public double getSkillValue() {
        return skillValue;
    }

}
