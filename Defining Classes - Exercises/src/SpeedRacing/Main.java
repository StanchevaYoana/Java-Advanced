package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Map<String, Car> carsList = new LinkedHashMap<>();

        while (n-- > 0){
            String [] data = reader.readLine().split("\\s+");
            carsList.putIfAbsent(data [0], new Car(data [0], Integer.parseInt(data [1]), Double.parseDouble(data [2])));
        }

        String input;
        while (!"End".equals(input = reader.readLine())){
            String [] data = input.split("\\s+");

            if (carsList.containsKey(data [1])){
                String car = data [1];
                int distance = Integer.parseInt(data [2]);
                if (carsList.get(data [1])
                        .isHaveEnoughFuel(distance,
                                carsList.get(car).getFuelAmount(),
                                carsList.get(car).getFuelPerKm())){
                    double fuel = distance * carsList.get(car).getFuelPerKm();
                    carsList.get(car).setKm(distance);
                    carsList.get(car).setFuelAmount(fuel);

                } else {
                    System.out.println("Insufficient fuel for the drive");
                }
            }
        }

        carsList.forEach((key, value) -> System.out.println(String.format("%s %.2f %d", key,
                value.getFuelAmount(),
                value.getKm())));
    }
}
