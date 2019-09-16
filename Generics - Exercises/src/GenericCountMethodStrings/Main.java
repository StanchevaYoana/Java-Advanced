package GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Box<String>> listOfBoxes = new ArrayList<>();
        while (n-- > 0) {
            Box<String> box = new Box<>(scanner.nextLine());
            listOfBoxes.add(box);
        }
        Box<String> comparator = new Box<>(scanner.nextLine());
        System.out.println(countGreaterElement(listOfBoxes, comparator));
    }

    public static <T extends Comparable<T>> int countGreaterElement(List<Box<T>> listOfBoxes,Box<T> comparator) {
        int count = 0;
        for (Box<T> t : listOfBoxes) {
            if (t.element.compareTo(comparator.element) > 0) {
                count++;
            }
        }
        return count;
    }
}
