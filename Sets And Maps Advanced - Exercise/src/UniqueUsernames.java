import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> names = new LinkedHashSet<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0){
            names.add(scanner.nextLine());
        }
        names.forEach(System.out::println);
    }
}
