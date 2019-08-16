import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("\\s+");
        int count = 0;
        StringBuilder words = new StringBuilder();
        for (String word : input) {
            if (Character.isAlphabetic(word.charAt(0)) && Character.isUpperCase(word.charAt(0))) {
                count++;
                words.append(word).append(System.lineSeparator());
            }
        }
        System.out.println(count);
        System.out.println(words);
    }
}
