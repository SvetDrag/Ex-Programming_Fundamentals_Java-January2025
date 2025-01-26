package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CondenseArrayToNumber07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int totalSum = 0;

        int [] num = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        //int firstNum = num[0];
       // int secondNum = num [1];

        if (num.length == 1) {
            System.out.println(num[0]);
        }

        for (int position = 0; position < num.length - 1; position++) {

            int pos2 = position + 1;

            int firstNum = num[position];
            int secondNum = num [pos2];

            sum = firstNum + secondNum;

            totalSum += sum;


           // firstNum = num [position];
           // secondNum = num [pos2];
        }
        System.out.println(totalSum);

    }
}
