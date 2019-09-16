package Jar;

public class Main {
    public static void main(String[] args) {


        Jar<String> jar = new Jar<String>();

        jar.add("Ivan");
        jar.add("Pesho");

        System.out.println(jar.remove());
    }
}
