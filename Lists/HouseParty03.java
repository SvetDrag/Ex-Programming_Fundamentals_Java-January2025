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
        String command = scanner.nextLine();
        List<String> guests = new ArrayList<>();


        for (int i = 1; i <= n ; i++) {

            List<String> command2 = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            if (command2.contains("is going!")) {
                String personToAdd = command.split(" ")[0];
                if (guests.contains(personToAdd)){
                    System.out.printf("%s is already in the list!", personToAdd);
                }
                else {
                    guests.add(personToAdd);
                    System.out.println(guests);
                }


            }

        }
    }
}
