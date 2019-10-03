import java.io.*;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        long sumChar = 0L;
        while ((line = reader.readLine()) != null){
            sumChar += line.chars().sum();
        }
        System.out.println(sumChar);

    }
}
