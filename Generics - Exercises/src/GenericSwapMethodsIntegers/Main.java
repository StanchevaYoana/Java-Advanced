package GenericSwapMethodsIntegers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Box<Integer>> list = new ArrayList<>();

        while (n-- > 0) {

            Box<Integer> box = new Box<>(Integer.parseInt(scanner.nextLine()));
            list.add(box);
        }

        int [] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        swapIndexesInArray(list, indexes[0], indexes[1]);
        list.forEach(e -> System.out.println(e.toString()));
    }

    private static void swapIndexesInArray(List<Box<Integer>> list, int firstIndex, int secondIndex) {

        list.add(list.get(firstIndex));
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, list.get(list.size() - 1));
        list.remove(list.size() - 1);
    }
}
