import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new HashSet<>();

        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            String[] command = input.split(", ");

            switch (command[0]) {
                case "IN":
                    parking.add(command[1]);
                    break;
                case "OUT":
                    parking.remove(command[1]);
                    break;
            }
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parking.forEach(System.out::println);
        }
    }
}
