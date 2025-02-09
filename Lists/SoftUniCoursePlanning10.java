package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")){
            if (command.contains("Add:")){
                String lessonToAdd = command.split(":")[1];
                text.add(lessonToAdd);
            }
            else if (command.contains("Isert:")){
                String lessonToInsert = command.split(":")[1];
                int index = Integer.parseInt(command.split(":")[2]);

                text.add(index, lessonToInsert);
            }
            else if (command.contains("Remove:")){
                String lessonToRemove = command.split(":")[1];
                text.remove(lessonToRemove);
            }
            else if (command.contains("Swap:")){
                String lesson1 = command.split(":")[1];
                String lesson2 = command.split(":")[2];
                if (text.contains(lesson1) && text.contains(lesson2)){
                    Collections.swap(text, text.indexOf(lesson1), text.indexOf(lesson2));
                }
                else {
                    continue;
                }
            }
            else if (command.contains("Exercise:")){
                String exerciseName = command.split(":")[1];
                if (text.contains(exerciseName)){
                    text.add(text.indexOf(exerciseName), exerciseName + "-Exercise");
                }
            }
        }
    }
}
