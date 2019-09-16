package GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Box> list = new ArrayList<>();
        while (n-- > 0) {
            Box<String> box = new Box<>(scanner.nextLine());

            list.add(box);

        }
        String[] indexes = scanner.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);

        swapIndexes(list, firstIndex, secondIndex);

        list.forEach(e -> System.out.println(e.toString()));
    }

    private static void swapIndexes(List<Box> list, int firstIndex, int secondIndex) {

        list.add(list.get(firstIndex));
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, list.get(list.size() - 1));
        list.remove(list.size() - 1);
    }
}
