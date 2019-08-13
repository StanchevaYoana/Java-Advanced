import java.util.*;

public class VoinaNumbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).forEach(firstPlayer::add);
        Set<Integer> secondPlayer = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).forEach(secondPlayer::add);

        for (int i = 0; i <= 50; i++) {

            if (secondPlayer.isEmpty() && firstPlayer.isEmpty()) break;

            Iterator<Integer> firstIterator = firstPlayer.iterator();
            Iterator<Integer> secondIterator = secondPlayer.iterator();
            int firstNum = firstIterator.next();
            firstPlayer.remove(firstNum);
            int secondNum = secondIterator.next();
            secondPlayer.remove(secondNum);

            if (firstNum > secondNum) {
                firstPlayer.add(firstNum);
                firstPlayer.add(secondNum);
            } else if(secondNum > firstNum){
                secondPlayer.add(firstNum);
                secondPlayer.add(secondNum);
            } else {
                secondPlayer.add(secondNum);
                firstPlayer.add(firstNum);
            }
        }

        if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        } else if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
