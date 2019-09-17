package Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] data = reader.readLine().split("\\s+");
        Threeuple<String, String, String> stringThreeuple = new Threeuple<>(data[0] + " " + data [1], data[2], data[3]);
        System.out.println(stringThreeuple);

        data = reader.readLine().split("\\s+");

        Threeuple<String, Integer, Boolean> secondThreeple;
        if (data [2].equals("drunk")){
            secondThreeple = new Threeuple<>(data[0]
                    , Integer.parseInt(data[1])
                    , true);

        } else {
            secondThreeple = new Threeuple<>(data[0]
                    , Integer.parseInt(data[1])
                    , false);
        }

        System.out.println(secondThreeple);

        data = reader.readLine().split("\\s+");

        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(data[0], Double.parseDouble(data[1]), data[2]);
        System.out.println(thirdThreeuple);
    }
}
