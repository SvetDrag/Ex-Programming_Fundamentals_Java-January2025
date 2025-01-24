package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations ; i++) {
            int firstNum = numbers[0];

            for (int position = 0; position < numbers.length - 1; position++) {
                numbers[position] = numbers [position+1];

            }
            numbers [numbers.length-1] = firstNum;
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
