package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PokemonDontGo09 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
         List<Integer> num = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt).collect(Collectors.toList());

         //int index = Integer.parseInt(scanner.nextLine());
         int sum = 0;

         while (!num.isEmpty()){
             int index = Integer.parseInt(scanner.nextLine());
             //int indexNumber = num.get(index);
             int indexNumber = 0;

             if (index < 0) {
                 indexNumber = num.get(0);
                 sum += indexNumber;
                 int lastElement = num.get(num.size() - 1);
                 num.remove(0);
                 num.add(0, lastElement);
             }
             else if (index > num.size()-1 ) {
                 indexNumber = num.get(num.size() - 1);
                 sum += indexNumber;
                 int firstElement = num.get(0);
                 num.remove(num.size()-1);
                 num.add(firstElement);
             }

             else{
                 indexNumber = num.get(index);
                 sum+=indexNumber;
                 num.remove(index);
             }

             //if (index <= num.size()){
                 //num.remove(index);
                 for (int i = 0; i < num.size(); i++) {
                     //int indexNumber = num.get(index);

                     if (num.get(i) <= indexNumber){

                         num.set(i, num.get(i) + indexNumber);

                     }
                     else if (num.get(i) > indexNumber){
                         num.set(i, num.get(i) - indexNumber);
                     }

                 }
            // }


            //index = Integer.parseInt(scanner.nextLine());

         }

         System.out.println(sum);
    }
}
