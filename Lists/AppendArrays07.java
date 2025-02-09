package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        List<String> texts = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(texts);

        for (String t : texts){
            if (t.equals("") || t.equals(" ")){
                continue;
            }
            System.out.print(t.trim().replaceAll("\\s+", " ") + " ");
        }


    }
}
