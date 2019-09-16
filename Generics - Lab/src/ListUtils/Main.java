package ListUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a", "b", "c", "d");
        System.out.println(ListUtils.getMax(stringList));
        System.out.println(ListUtils.getMin(stringList));
        List<Integer> integerList = Arrays.asList(1,2,5,9);
        System.out.println(ListUtils.getMax(integerList));
        System.out.println(ListUtils.getMin(integerList));

    }
}
