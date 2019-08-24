package SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelPerKm;
    private int km;

    Car(String model, double fuelAmount, double fuelPerKm){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPerKm = fuelPerKm;
        this.km = 0;
    }
    public void setKm (int km){
        this.km += km;
    }

    public  void setFuelAmount(double fuelAmount){
        this.fuelAmount -= fuelAmount;
    }
    public int getKm(){
        return this.km;
    }
    public String getModel (){
        return this.model;
    }
    public double getFuelAmount (){
        return this.fuelAmount;
    }
    public double getFuelPerKm (){
        return this.fuelPerKm;
    }

    public boolean isHaveEnoughFuel (int distance ,double fuelAmount, double fuelPerKm){
        return distance * fuelPerKm <= fuelAmount;
    }





}
