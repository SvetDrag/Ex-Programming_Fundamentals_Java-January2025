package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class TheLift10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int waitingPeople = Integer.parseInt(scanner.nextLine());


        int[] lift = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0; i < lift.length; i++) {
            while (lift[i] < 4 && waitingPeople > 0) {
                lift[i]++;
                waitingPeople--;
            }
        }


        boolean isLiftFull = Arrays.stream(lift).allMatch(w -> w == 4);

        if (waitingPeople == 0 && !isLiftFull) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeople > 0 && isLiftFull) {
            System.out.println("There isn't enough space! " + waitingPeople + " people in a queue!");
        }


        System.out.println(Arrays.toString(lift).replaceAll("[\\[\\],]", ""));
    }
}
