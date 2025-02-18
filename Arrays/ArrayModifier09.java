package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);

                    // Разменяме местата на числата
                    int temp = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = temp;
                    break;

                case "multiply":
                    int indexA = Integer.parseInt(tokens[1]);
                    int indexB = Integer.parseInt(tokens[2]);

                    // Умножаваме и записваме резултата на първия индекс
                    numbers[indexA] *= numbers[indexB];
                    break;

                case "decrease":
                    // Намаляваме всички числа с 1
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]--;
                    }
                    break;
            }

            command = scanner.nextLine();
        }


        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\]]", ""));
    }

}
