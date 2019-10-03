import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\inputLineNumbers.txt ";
        String outputFilePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\outputLineNumbers.txt ";

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        int count = 0;

        try {
            String line = reader.readLine();
            while (line != null) {
                count++;
                writer.write(count+". " + line + System.lineSeparator());
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        writer.close();
    }
}
