import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        String string;

        while (!"search".equals(string = scanner.nextLine())){
            String[] nameNumber = string.split("-");
            phoneBook.put(nameNumber[0],nameNumber[1]);
        }
        while (!"stop".equals(string = scanner.nextLine())){
            if (phoneBook.containsKey(string)){
                System.out.printf("%s -> %s%n",string, phoneBook.get(string));
            } else {
                System.out.printf("Contact %s does not exist.%n", string);
            }
        }
    }
}
