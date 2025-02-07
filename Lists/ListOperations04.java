package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ListOperations04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //•	Add {number} - add number at the end
        //•	Insert {number} {index} - insert number at given index
        //•	Remove {index} - remove that index
        //•	Shift left {count} - first number becomes last 'count' times
        //•	Shift right {count} - last number becomes first 'count' times

         List<Integer> num = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt).collect(Collectors.toList());

         String command = scanner.nextLine();

         while (!command.equals("End")){
             if (command.contains("Add")){
                 int numToAdd = Integer.parseInt(command.split(" ")[1]);
                 num.add(numToAdd);
             }
             if (command.contains("Insert")){
                 int numToInsert = Integer.parseInt(command.split(" ")[1]);
                 int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                 if (indexToInsert >= 0 && indexToInsert <= num.size()) {
                     num.add(indexToInsert, numToInsert);
                 }
                 else {
                     System.out.println("Invalid index");
                 }
             }
             if (command.contains("Remove")){
                 int numToRemove = Integer.parseInt(command.split(" ")[1]);
                 if (numToRemove >= 0 && numToRemove < num.size()) {
                     num.remove(numToRemove);
                 }
                 else {
                     System.out.println("Invalid index");
                 }
             }
             if (command.contains("Shift")) {
                 String position = command.split(" ")[1];
                 int count = Integer.parseInt(command.split(" ")[2]);
                 if (position.equals("left")){
                     for (int i = 1; i <= count ; i++) {
                         int firstNuim = num.get(0);
                         num.remove(0);
                         num.add(firstNuim);
                     }

                 }
                 else if (position.equals("right")){
                     for (int i = 1; i <= count ; i++) {
                         int lastNuim = num.get(num.size()-1);
                         num.remove(num.get(num.size()-1));
                         num.add(0, lastNuim);


                     }

                 }
             }

             command = scanner.nextLine();

         }

         for (int n : num){
             System.out.print(n + " ");
         }

    }
}
