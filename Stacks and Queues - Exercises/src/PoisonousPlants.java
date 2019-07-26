import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class PoisonousPlants {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());

        List<Integer> inputPlants = Arrays.stream(read.readLine().split(" ")).map(Integer::parseInt).limit(n).collect(Collectors.toList());

        int countDays = 0;
        boolean continueDying = true;

        while (continueDying) {
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            int count = 0;
            for (int i = 0; i < inputPlants.size(); i++) {
                if (i == 0) {
                    queue.offer(inputPlants.get(i));
                } else {
                    if (inputPlants.get(i - 1) < inputPlants.get(i)) {
                        count++;
                    } else {
                        queue.offer(inputPlants.get(i));
                    }
                }
            }
            if (count == 0) {
                continueDying = false;
            } else {
                inputPlants.clear();
                inputPlants.addAll(queue);
                countDays++;
            }
        }
        System.out.println(countDays);
    }
}