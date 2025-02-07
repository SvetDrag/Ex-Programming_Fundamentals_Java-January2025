package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ChangeList02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

         List<Integer> num = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt).collect(Collectors.toList());

         String command = scanner.nextLine();

         while (!command.equals("end")){

             if (command.contains("Delete")){
                 int numToDelete = Integer.parseInt(command.split(" ")[1]);


                 for (int i = 0; i < num.size(); i++) {
                     if (num.get(i) == numToDelete){
                         num.remove(Integer.valueOf(numToDelete));
                     }
                 }

             }
             else if (command.contains("Insert")) {
                 int elementToInsert = Integer.parseInt(command.split(" ")[1]);
                 int positionToInsert = Integer.parseInt(command.split(" ")[2]);

                 num.add(positionToInsert, elementToInsert);
             }

             command = scanner.nextLine();

         }
         for (int n : num) {
             System.out.print(n + " ");
         }
         //System.out.println(num);



    }
}
