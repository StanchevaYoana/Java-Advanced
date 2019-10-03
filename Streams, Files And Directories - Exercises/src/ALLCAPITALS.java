import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\input.txt";
        String outputFile = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\output2.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        BufferedReader reader = new BufferedReader(new FileReader(filePath));


        try {
            String line = reader.readLine();
            while (line != null){
                writer.write(line.toUpperCase() + System.lineSeparator());
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        writer.close();
    }
}
