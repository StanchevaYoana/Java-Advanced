package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> stringList = Arrays.stream(reader.readLine()
                .split("\\s+")).skip(1).collect(Collectors.toList());

        ListyIterator iterator = new ListyIterator(stringList);

        String data;
        while (!"END".equals(data = reader.readLine())) {

            switch (data) {
                case "Move":
                    System.out.println(iterator.move());
                    break;
                case "Print":
                    System.out.println(iterator.print());
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "PrintAll":
                    iterator.printAll();

            }
        }
    }
}
