import java.util.*;
import java.util.stream.Collectors;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> mainList = new ArrayList<>();
        int value = 1;
        for (int i = 0; i < r; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int col = 0; col < c; col++) {
                rowList.add(value++);

            }
            mainList.add(rowList);
        }

        String input;
        while (!"Nuke it from orbit".equals(input = scanner.nextLine())) {

            int[] command = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = command[0];
            int col = command[1];
            int bomb = command[2];


            for (int i = 0; i < mainList.size(); i++) {
                for (int j = 0; j < mainList.get(i).size(); j++) {
                    if ((i == row && Math.abs(j - col) <= bomb) ||
                            (j == col && Math.abs(i - row) <= bomb)) {
                        mainList.get(i).set(j, 0);
                    }
                }
            }

            for (int i = 0; i < mainList.size(); i++) {
                mainList.set(i, mainList.get(i).stream().filter(element -> element > 0).collect(Collectors.toList()));

                if (mainList.get(i).size() == 0) {
                    mainList.remove(i);
                    i--;
                }
            }
        }

        for (List<Integer> integers : mainList) {

            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}