package CarInfo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        IntStream
                .rangeClosed(1,n)
                .boxed()
                .map(f -> scanner.nextLine().split("\\s+"))
                .map(data -> {
                    return new Car(data[0], data [1], Integer.parseInt(data [2]));
                }).forEach(car -> System.out.println
                (String.format("The car is: %s %s - %d HP.",car.getMake(),car.getModel(),car.getHorsePower())));
    }
}
