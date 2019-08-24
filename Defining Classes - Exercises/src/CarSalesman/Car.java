package CarSalesman;

public class Car {

    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {

        return String.format("%s: \n%s: \nPower: %s\nDisplacement: %s\nEfficiency: %s\nWeight: %s\nColor: %s", getModel()
                , engine.getModel()
                , engine.getPower()
                , engine.getDisplacement()
                , engine.getEfficiency()
                , getWeight()
                , getColor());
    }

}
