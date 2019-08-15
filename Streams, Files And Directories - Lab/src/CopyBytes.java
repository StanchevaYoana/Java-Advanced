import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        String pathIn = System.getProperty("user.dir") + "/res/input.txt";
        String pathOut = System.getProperty("user.dir") + "/res/03.CopyBytesOutput.txt";

        try (FileInputStream fis = new FileInputStream(pathIn);
             FileOutputStream fos = new FileOutputStream(pathOut)) {


            int oneByte = fis.read();

            while (oneByte >= 0) {
                if (oneByte == 32 || oneByte == 10) {
                    fos.write(oneByte);
                } else {
                    String value = String.valueOf(oneByte);

                    for (int i = 0; i < value.length(); i++) {
                        fos.write(value.charAt(i));
                    }
                }

                oneByte = fis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
