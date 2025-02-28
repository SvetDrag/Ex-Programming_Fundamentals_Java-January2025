package AssociativeArrays;

import java.util.Scanner;

public class Orders03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        while (!input.equals("buy")){


            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Double.parseDouble(input.split(" ")[2]);








            input = scanner.nextLine();
        }

    }
}
