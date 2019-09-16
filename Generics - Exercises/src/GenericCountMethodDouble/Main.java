package GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Box<Double>> list = new ArrayList<>();
        while (n-- > 0) {
            Box<Double> box = new Box<>(Double.parseDouble(reader.readLine()));
            list.add(box);
        }

        Box<Double> comparator = new Box<>(Double.parseDouble(reader.readLine()));

        System.out.println(countGreaterNums(list, comparator));
    }

    public static <T extends Comparable<T>> int countGreaterNums(List<Box<T>> list, Box<T> comparator) {
        int count = 0;

        for (Box<T> t : list) {
            if (t.getElement().compareTo(comparator.getElement()) > 0){
                count++;
            }

        }
        return count;
    }
}

