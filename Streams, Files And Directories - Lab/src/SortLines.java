import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String userDir = System.getProperty("user.dir");

        Path pathIn = Paths.get(userDir + "/res/input.txt");
        Path pathOut = Paths.get(userDir + "/res/06.SortLinesOutput.txt");


        List<String> lines = Files.readAllLines(pathIn)
                .stream().filter(e -> !e.isEmpty())
                .sorted()
                .collect(Collectors.toList());

        Files.write(pathOut, lines);
    }
}
