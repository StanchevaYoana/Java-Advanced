import java.io.*;
import java.util.Scanner;

public class ЕxtractIntegers {

    public static void main(String[] args) throws FileNotFoundException {

        String pathIn = System.getProperty("user.dir") + "/res/input.txt";
        String pathOut = System.getProperty("user.dir") + "/res/04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(pathIn));

        PrintWriter out = new PrintWriter(new FileOutputStream(pathOut));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                out.println(scanner.nextInt());
            }
            scanner.next();

        }
        out.close();
    }
}
