package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

       String command = scanner.nextLine();

       while (!command.equals("3:1")){

            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }
                if (endIndex > input.size()-1){
                    endIndex = input.size()-1;
                }

                if (startIndex >= 0 && startIndex <= input.size() - 1 && endIndex >= 0 && endIndex <= input.size() - 1) {

                    String result = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String current = input.get(index);
                        result += current;
                    }

                    for (int index = startIndex; index <= endIndex; index++) {
                        input.remove(startIndex);
                    }
                    input.add(startIndex, result);
                }

            }
            else if (command.contains("divide")){

                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);


                if (index >= 0 && index <= input.size() - 1) {

                    String textToDivide = input.get(index);
                    input.remove(index);

                    int symbolsCount = textToDivide.length() / partitions;

                    int startIndex = 0;
                    for (int part = 1; part < partitions; part++) {
                        String textPerPart = textToDivide.substring(startIndex, startIndex + symbolsCount);
                        input.add(index, textPerPart);
                        index++;
                        startIndex += symbolsCount;
                    }

                    String textLastParts = textToDivide.substring(startIndex, textToDivide.length());
                    input.add(index, textLastParts);
                }
            }
           command = scanner.nextLine();

       }

                 System.out.println(String.join(" ", input));

       }


    }

