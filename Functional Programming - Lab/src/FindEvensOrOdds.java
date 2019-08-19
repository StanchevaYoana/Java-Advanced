import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String [] input  = read.readLine().split(" ");
        String type = read.readLine();

        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);
        Predicate<Integer> byType = number1 -> number1 % 2 == 0;
        if(type.equals("odd")){
            byType = number -> number % 2 != 0;
        }

        IntStream.rangeClosed(lowerBound,upperBound)
                .boxed()
                .filter(byType)
                .forEach(x -> System.out.print(x + " "));
    }
}
