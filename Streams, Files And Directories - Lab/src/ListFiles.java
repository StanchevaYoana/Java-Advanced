import java.io.File;


public class ListFiles {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Yoana Stancheva\\Desktop");

        File[] allFile = f.listFiles();

        if(allFile == null) return;
        for (File fi : allFile) {
            if (!fi.isDirectory()){
                System.out.printf("%s: [%d]%n",fi.getName(), fi.length());
            }
        }
    }
}
