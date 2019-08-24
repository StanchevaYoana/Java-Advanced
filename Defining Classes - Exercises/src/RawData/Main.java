package RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Car> carList = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            int speed = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);
            int weight = Integer.parseInt(tokens[3]);
            String type = tokens[4];
            List<Tire> tires = new ArrayList<>();

            for (int i = 5; i < tokens.length; i += 2) {

                Tire tire = new Tire(Double.parseDouble(tokens[i]), Integer.parseInt(tokens[i + 1]));

                tires.add(tire);
            }
            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(weight, type);
            carList.add(new Car(model, engine, cargo, tires));
        }

        String command = reader.readLine();
        if (command.equalsIgnoreCase("fragile")) {
            for (Car car : carList) {
                if (car.checkFragile()) {
                    System.out.println(car.getModel());
                }
            }
        } else {
            for (Car car : carList) {
                if (car.checkFlamable()) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}