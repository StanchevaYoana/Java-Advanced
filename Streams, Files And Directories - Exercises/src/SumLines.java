
import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\input.txt";
        String outputPath = filePath.substring(0,filePath.lastIndexOf("\\") + 1) + "askiSum.txt";
        FileWriter writer = new FileWriter(outputPath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine() )!= null) {
                writer.write(line.chars().sum()+"");
                writer.write(System.lineSeparator());
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());

        }
        writer.close();
    }
}
