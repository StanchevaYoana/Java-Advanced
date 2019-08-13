import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Double>>shops = new TreeMap<>();

        String string;

        while (!"Revision".equals(string = scanner.nextLine())){

            String[] tokens = string.split(", ");

            String shop = tokens[0];
            String product = tokens [1];
            double price = Double.parseDouble(tokens [2]);

            shops.putIfAbsent(shop,new LinkedHashMap<>());
            shops.get(shop).put(product,price);
        }
        for (Map.Entry<String, Map<String, Double>> shop : shops.entrySet()) {
            System.out.println(shop.getKey() + "->");
            shop.getValue().forEach((key, value) -> System.out.println(String.format("Product: %s, Price: %.1f", key, value)));
        }
    }
}
