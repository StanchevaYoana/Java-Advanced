package StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack customStack = new CustomStack();

        String data;

        while (!"END".equals(data = reader.readLine())) {
            String[] input = data.split(", +");

            if (input[0].contains("Push")) {
                customStack.push((Integer.parseInt(input[0].split(" +")[1])));

                for (int i = 1; i < input.length; i++) {
                    customStack.push(Integer.parseInt(input[i].trim()));
                }
            }

            if (input[0].equals("Pop")) {

                try {
                    customStack.pop();
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());

                }
            }
        }

        for (int num : customStack) {
            System.out.println(num);

        }
        for (int num : customStack) {
            System.out.println(num);

        }
    }
}
