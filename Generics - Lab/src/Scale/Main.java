package Scale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> integerScale = new Scale<Integer>(2,2);
        System.out.println(integerScale.getHeavier());
        Scale<Character> charScale = new Scale<Character>('a','a');
        System.out.println(charScale.getHeavier());
    }
}
