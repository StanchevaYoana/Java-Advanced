package Constructors;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntStream
                .rangeClosed(1,Integer.parseInt(scanner.nextLine()))
                .boxed()
                .map(n -> scanner.nextLine().split("\\s+"))
                .map(data ->{
                    Constructors current;
                    if (data.length > 1) {
                        current = new Constructors(data[0], data[1], Integer.parseInt(data[2]));
                    } else {
                        current = new Constructors(data [0]);
                    }
                    return  current;
                }).forEach(car -> System.out.println(String.format("The car is: %s %s - %d HP."
                ,car.getMake(),car.getModel(),car.getHorsePower())));
    }
}
