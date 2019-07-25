import java.time.LocalTime;
import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(";");

        String[] robots = new String[input.length];
        int[] processTime = new int[input.length];
        int[] workingTime = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            String[] data = input[i].split("-");
            String name = data[0];
            int time = Integer.parseInt(data[1]);
            robots[i] = name;
            processTime[i] = time;
        }

        String startTime = scanner.nextLine();
        int[] times = Arrays.stream(startTime.split(":")).mapToInt(Integer::parseInt).toArray();

        LocalTime time = LocalTime.of(times[0], times[1], times[2]);

        ArrayDeque<String> products = new ArrayDeque<>();
        String inputProduct;
        while (!"End".equals(inputProduct = scanner.nextLine())) {
            products.offer(inputProduct);
        }

        while (!products.isEmpty()) {
            time = time.plusSeconds(1);
            String product = products.pop();
            boolean isAssign = false;
            for (int i = 0; i < robots.length; i++) {
                if (workingTime[i] == 0 && !isAssign) {
                    workingTime[i] = processTime[i];
                    isAssign = true;
                    System.out.println(String.format("%s - %s [%02d:%02d:%02d]"
                            , robots[i], product, time.getHour(), time.getMinute(), time.getSecond()));
                }

                if (workingTime[i] > 0) {
                    workingTime[i]--;
                }
            }
            if (!isAssign) {
                products.offer(product);
            }
        }
    }
}