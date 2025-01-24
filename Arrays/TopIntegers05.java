package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] num = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int biggestNum = 0;
       int position = 1;

        for (int i = 0; i <= num.length - 1; i++) {
            //int position = 1;
            int a = num [i];
            int b = 0;
            //num [position] = b;
            b = num [position];
            //num [i] = a;
            if (!(position == num.length-1)) {
            position++;
            }

            if (a > b) {
                System.out.print(a + " ");
            }


        }




    }
}
