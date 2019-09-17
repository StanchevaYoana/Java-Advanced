package Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] data = reader.readLine().split("\\s+");
        String name = data[0] + " " + data [1];
        Tuple<String,String> stringTuple = new Tuple<>(name, data [2]);
        System.out.println(stringTuple.toString());

        data = reader.readLine().split("\\s+");
        Tuple<String, Integer> integerTuple = new Tuple<>(data[0]
                , Integer.parseInt(data[1]));
        System.out.println(integerTuple.toString());

        data = reader.readLine().split("\\s+");
        Tuple<Integer, Double> doubleTuple = new Tuple<>(Integer.parseInt(data[0])
                , Double.parseDouble(data[1]));
        System.out.println(doubleTuple.toString());
    }
}
