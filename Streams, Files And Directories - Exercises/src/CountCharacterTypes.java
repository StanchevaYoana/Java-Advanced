import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws FileNotFoundException {

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        String filePath = "C:\\Users\\Yoana Stancheva\\Desktop\\GitHub\\Java-Advanced\\Streams, Files And Directories - Exercises\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        try {
            String line = reader.readLine();
            while (line != null) {
                for (char a : line.toCharArray()) {
                    if (a != ' ') {
                        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                            vowels++;
                        } else if (a == '!' || a == ',' || a == '.' || a == '?') {
                            punctuation++;
                        } else {
                            consonants++;
                        }
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(String.format("Vowels: %d\n" +
                "Consonants: %d\n" +
                "Punctuation: %d\n", vowels, consonants, punctuation));
    }
}