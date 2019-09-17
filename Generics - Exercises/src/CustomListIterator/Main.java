package CustomListIterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomListIterator<String> customListIterator = new CustomListIterator<String>();

        String input;

        while(!"END".equals(input=reader.readLine())){

            String[] tokens = input.split("\\s+");

            switch (tokens[0]){
                case "Add":
                    customListIterator.add(tokens[1]);
                    break;
                case "Remove":
                    customListIterator.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(customListIterator.contains(tokens[1]));
                    break;
                case "Swap":
                    customListIterator.swap(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(customListIterator.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(customListIterator.getMax());
                    break;
                case "Min":
                    System.out.println(customListIterator.getMin());
                    break;
                case "Print":
                    customListIterator.getData().forEach(System.out::println);
                    break;
                case "Sort":
                    customListIterator.sort();
                    break;
            }
        }
    }
}
