package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, Engine> engineMap = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            String displacement = "n/a";
            String efficiency = "n/a";

            if (tokens.length == 3) {
                if (Character.isDigit(tokens[2].charAt(0))) {
                    displacement = tokens[2];
                } else {
                    efficiency = tokens[2];
                }
            } else if (tokens.length == 4) {
                displacement = tokens[2];
                efficiency = tokens[3];
            }

            Engine engine1 = new Engine(model, power, displacement, efficiency);
            engineMap.putIfAbsent(model, engine1);
        }

        List<Car> cars = new ArrayList<>();
        int m = Integer.parseInt(reader.readLine());

        while (m-- > 0) {
            String[] command = reader.readLine().split("\\s+");

            String carModel = command[0];
            String engineModel = command[1];
            String weight = "n/a";
            String color = "n/a";

            if (command.length == 3) {
                if (Character.isDigit(command[2].charAt(0))) {
                    weight = command[2];
                } else {
                    color = command[2];
                }
            }
            if (command.length == 4) {
                weight = command[2];
                color = command[3];
            }
            Car car = new Car(carModel, engineMap.get(engineModel), weight, color);
            cars.add(car);
        }

        for (Car c : cars) {
            System.out.println(c.toString());
        }
    }
}

