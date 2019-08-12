import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String string;
        while (!"PARTY".equals(string = scanner.nextLine())) {
            if (Character.isDigit(string.charAt(0))) {
                vip.add(string);
            } else {
                regular.add(string);
            }
        }

        while (!"END".equals(string = scanner.nextLine())) {
            vip.remove(string);
            regular.remove(string);
        }

        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
