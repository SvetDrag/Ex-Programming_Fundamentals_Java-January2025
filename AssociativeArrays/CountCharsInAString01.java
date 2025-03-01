package AssociativeArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String text = scanner.nextLine();


        Map<Character, Integer> charsCount = new LinkedHashMap<>();

        for (char c : text.toCharArray()){

            if (c != ' ') {
                charsCount.put(c, charsCount.getOrDefault(c, 0) + 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : charsCount.entrySet()){
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }



    }
}
