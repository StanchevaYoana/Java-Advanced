import java.io.File;

public class NestedFolders {
    public static void main(String[] args) {


        File f = new File("C:\\Users\\Yoana Stancheva\\Desktop");

        DFS(f);
    }

    private static void DFS(File root) {

        if (root == null) return;
        File[] files = root.listFiles();
        if (files == null) return;

        for (File f : files) {
            if (f.isDirectory()) {
                DFS(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
