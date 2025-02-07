package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<Integer> num = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        String command = scanner.nextLine();
        while (!command.equals("end")){

            if (command.contains("Add")){
                int numToAdd =  Integer.parseInt(command.split(" ")[1]);
                num.add(numToAdd);
            }
            else {
                int passToAdd = Integer.parseInt(command);
                for (int i = 0; i < num.size(); i++) {
                    sum = passToAdd + num.get(i);

                    if (sum <= maxCapacity){
                        num.set(i, passToAdd+num.get(i));
                        break;
                    }
                }

            }


            command = scanner.nextLine();
        }

        for (int n : num) {
            System.out.print(n + " ");
        }

    }
}
