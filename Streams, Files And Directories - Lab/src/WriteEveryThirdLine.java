import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String pathIn = System.getProperty("user.dir") + "/res/input.txt";
        String pathOut = System.getProperty("user.dir") + "/res/05.WriteEveryThirdLineOutput.txt";


        int counter = 1;

        try (BufferedReader read = new BufferedReader(new FileReader(pathIn));
             BufferedWriter print = new BufferedWriter(new PrintWriter(pathOut))) {
            String line = "";

            while ((line = read.readLine()) != null) {

                if (counter % 3 == 0) {
                    print.write(line);
                    print.write(System.lineSeparator());
                }
                counter++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

