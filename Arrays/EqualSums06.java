package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EqualSums06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] num = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        boolean found = false;

        for (int position = 0; position <= num.length - 1; position++) {

            if (num.length == 1) {
                System.out.println("0");
                break;
            }

            int leftSum = 0;
            int rightSum = 0;

            for (int leftPosition = 0; leftPosition < position; leftPosition++) {
                leftSum += num[leftPosition];
            }

            for (int rightPosition = position + 1; rightPosition < num.length; rightPosition++) {
                rightSum += num[rightPosition];
            }

                if (rightSum == leftSum) {
                    System.out.println(position);
                    found = true;
                    break;
                }

        }

        if (!found) {
            System.out.println("no");
        }





    }
}
