package ListUtils;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtils<T> {

    public static <T> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<T> collection = list.stream().sorted().collect(Collectors.toList());

        return collection.get(collection.size() - 1);
    }

    public static <T> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<T> collection = list.stream().sorted().collect(Collectors.toList());

        return collection.get(0);

    }
}
