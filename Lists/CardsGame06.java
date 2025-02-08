package Lists;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int count = 0;
        int sum1 = 0;
        int sum2 = 0;

        while(!firstHand.isEmpty() && !secondHand.isEmpty()){

            if (firstHand.get(count) > secondHand.get(count)){

                firstHand.add(firstHand.get(count));
                firstHand.remove(firstHand.get(count));
                firstHand.add(secondHand.get(count));
                secondHand.remove(count);



            }
            else if (firstHand.get(count) < secondHand.get(count)){

                secondHand.add(secondHand.get(count));
                secondHand.remove(secondHand.get(count));
                secondHand.add(firstHand.get(count));
                firstHand.remove(count);



            }
            else {
                firstHand.remove(count);
                secondHand.remove(count);


            }


        }
        if (!firstHand.isEmpty()) {
            System.out.println("First player wins! Sum: " + firstHand.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.println("Second player wins! Sum: " + secondHand.stream().mapToInt(Integer::intValue).sum());
        }
    }
}
