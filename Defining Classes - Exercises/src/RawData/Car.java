package RawData;

import java.util.List;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car (String model, Engine engine, Cargo cargo, List<Tire> tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public boolean checkFragile() {
        List<Tire>tireArray = tires;
        boolean isFragile = false;

        for (Tire tire : tireArray) {
            if (tire.getPressure() < 1)
                isFragile = true;
        }
        return isFragile;
    }

    public boolean checkFlamable() {
        int power = engine.getEnginePower();
        boolean isFlamable = false;
        if (power > 250) isFlamable = true;
        return isFlamable;
    }
}
