package Constructors;

public class Constructors {
    public String make;
    public String model;
    public  int horsePower;


    public Constructors(String make) {
        this.make = make;
        this.model = "unknown";
        this.horsePower = -1;

    }

    public Constructors(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
