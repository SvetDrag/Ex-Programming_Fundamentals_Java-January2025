package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        Map<String, Integer> minerList = new LinkedHashMap<>();
        int quantity = 0;

        while (!input.equals("stop")){
            quantity = Integer.parseInt(scanner.nextLine());



            if (!minerList.containsKey(input)){
                minerList.put(input, quantity);
            }
            else {
                int currentQuantity = minerList.get(input);
                minerList.put(input, currentQuantity + quantity);
            }

            input = scanner.nextLine();


        }

        for (Map.Entry<String, Integer> entry : minerList.entrySet()){

            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
