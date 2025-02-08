package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();


        for (int i = 0; i < n ; i++) {

            String command = scanner.nextLine();
            String name = command.split(" ")[0];

            if (command.contains("not")) {

                if (guests.contains(name)){
                    guests.remove(name);
                }
                else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            }
            else {
                if (guests.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }
                else {
                    guests.add(name);
                }
            }

        }

        for(String m : guests){
            System.out.println(m);
        }
    }
}
