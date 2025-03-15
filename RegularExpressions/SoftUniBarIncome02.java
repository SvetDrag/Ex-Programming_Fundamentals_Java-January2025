package RegularExpressions;

import javax.swing.text.Style;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        String regex = "%(?<name>[A-Z]{1}[a-z]+)%\\w*<(?<product>\\w+)>\\w*\\|(?<count>\\d+)\\|[A-z]*(?<price>\\d+.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0.0;
        double totalIncome = 0.0;



        while (!input.equals("end of shift")){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                totalPrice = price * count;
                totalIncome += totalPrice;


                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);


            }


            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);




    }
}
