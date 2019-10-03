import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\text.txt";
        String filePath2 = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\words.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        BufferedReader reader2 = new BufferedReader(new FileReader(filePath2));

        Map<String, Integer> wordsSequences = new LinkedHashMap<>();


        try {
            String[] words = reader2.readLine().split("\\s+");
            String line = reader.readLine();
            Arrays.stream(words).forEach(e -> wordsSequences.putIfAbsent(e, 0));

            while (line != null) {
                String[] inputWords = line.split("\\s+");
                for (String inputWord : inputWords) {
                    if (wordsSequences.containsKey(inputWord)) {
                        wordsSequences.put(inputWord, wordsSequences.get(inputWord) + 1);
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        wordsSequences.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
