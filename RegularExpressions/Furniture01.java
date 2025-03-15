package RegularExpressions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<name>\\w+)<<(?<price>\\d+.?\\d+)!(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println("Bought furniture:");
        double totalPrice = 0.0;





        while (!input.equals("Purchase")){

            if (matcher.find()){
                //String[] text = matcher.group().split("[<<!]");
                String furniture = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalPrice = price * quantity;

                System.out.println(furniture);

            }

            input = scanner.nextLine();
        }

        System.out.printf("%.2f", totalPrice);


    }
}
