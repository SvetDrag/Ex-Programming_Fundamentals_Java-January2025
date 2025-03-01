package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Double> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] data = input.split(" ");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            productPrice.put(name, price);

            productQuantity.put(name, productQuantity.getOrDefault(name, 0.0) + quantity); 

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productQuantity.entrySet()) {
            String product = entry.getKey();
            double totalPrice = productPrice.get(product) * entry.getValue();
            System.out.printf("%s -> %.2f%n", product, totalPrice);
        }
    }
}
