import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        String pathIn = System.getProperty("user.dir") + "/res/input.txt";
        String pathOut = System.getProperty("user.dir") + "/res/02.WriteToFileOutput.txt";

        try (FileInputStream fis = new FileInputStream(pathIn);
             FileOutputStream fos = new FileOutputStream(pathOut)) {

            int oneByte = fis.read();
            while (oneByte >= 0) {
                if (oneByte != '!' &&
                        oneByte != '?' &&
                        oneByte != '.' &&
                        oneByte != ',') {
                    fos.write(oneByte);
                }
                oneByte = fis.read();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
