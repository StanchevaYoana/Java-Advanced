import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String inputOneFilePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\inputOne.txt";
        String inputTwoFilePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\inputTwo.txt";
        String outputFilePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\outputMergeTwoFiles.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

        BufferedReader reader = new BufferedReader(new FileReader(inputOneFilePath));

        String line;

        while ((line = reader.readLine()) != null){
            writer.write(line + System.lineSeparator());
        }

        reader = new BufferedReader(new FileReader(inputTwoFilePath));

        while ((line = reader.readLine()) != null){
            writer.write(line + System.lineSeparator());
        }

        writer.close();

    }
}
