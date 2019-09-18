package Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> lakeData = Arrays.stream(reader.readLine().split(", +")).map(Integer::parseInt)
                .collect(Collectors.toList());

        Lake lake = new Lake(lakeData);

        List<Integer> printData = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();
        int index = 1;

        for (Integer number : lake) {
            if (index % 2 != 0) {
                printData.add(number);
            } else {
                oddNums.add(number);
            }
            index++;
        }
        printData.addAll(oddNums);
        System.out.println(printData.toString().replaceAll("[\\[\\]]",""));

    }
}
