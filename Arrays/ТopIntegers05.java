package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ТopIntegers05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] num = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int biggestNum = 0;

        for (int i = 0; i < num.length - 1; i++) {
            int n = 0;
            num [i] = n;
            if (n > biggestNum){
                biggestNum = n;
            }
        }

    }
}
