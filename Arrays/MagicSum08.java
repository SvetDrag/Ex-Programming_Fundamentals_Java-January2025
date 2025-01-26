package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());



    }
}
