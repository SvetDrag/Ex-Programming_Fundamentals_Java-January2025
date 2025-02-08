package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class BombNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String[] bombData = scanner.nextLine().split(" ");
        int bombNumber = Integer.parseInt(bombData[0]);
        int power = Integer.parseInt(bombData[1]);


        while (numbers.contains(bombNumber)) {
            int index = numbers.indexOf(bombNumber);


            int start = Math.max(0, index - power);
            int end = Math.min(numbers.size() - 1, index + power);


            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }
        }


        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
