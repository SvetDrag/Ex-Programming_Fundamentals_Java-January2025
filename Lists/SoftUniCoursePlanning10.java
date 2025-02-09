package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            String action = tokens[0];

            if (action.equals("Add")) {
                String lessonToAdd = tokens[1];
                if (!text.contains(lessonToAdd)) {
                    text.add(lessonToAdd);
                }
            } else if (action.equals("Insert")) {
                String lessonToInsert = tokens[1];
                int index = Integer.parseInt(tokens[2]);

                if (!text.contains(lessonToInsert) && index >= 0 && index <= text.size()) {
                    text.add(index, lessonToInsert);
                }
            } else if (action.equals("Remove")) {
                String lessonToRemove = tokens[1];
                if (text.contains(lessonToRemove)) {
                    int indexToRemove = text.indexOf(lessonToRemove);
                    text.remove(lessonToRemove);


                    if (indexToRemove < text.size() && text.get(indexToRemove).equals(lessonToRemove + "-Exercise")) {
                        text.remove(indexToRemove);
                    }
                }
            } else if (action.equals("Swap")) {
                String lesson1 = tokens[1];
                String lesson2 = tokens[2];

                if (text.contains(lesson1) && text.contains(lesson2)) {
                    int index1 = text.indexOf(lesson1);
                    int index2 = text.indexOf(lesson2);

                    Collections.swap(text, index1, index2);

                    // Swap exercises if they exist
                    if (text.contains(lesson1 + "-Exercise")) {
                        text.remove(lesson1 + "-Exercise");
                        text.add(index2 + 1, lesson1 + "-Exercise");
                    }

                    if (text.contains(lesson2 + "-Exercise")) {
                        text.remove(lesson2 + "-Exercise");
                        text.add(index1 + 1, lesson2 + "-Exercise");
                    }
                }
            } else if (action.equals("Exercise")) {
                String lessonTitle = tokens[1];

                if (text.contains(lessonTitle)) {
                    int lessonIndex = text.indexOf(lessonTitle);
                    if (!text.contains(lessonTitle + "-Exercise")) {
                        text.add(lessonIndex + 1, lessonTitle + "-Exercise");
                    }
                } else {
                    text.add(lessonTitle);
                    text.add(lessonTitle + "-Exercise");
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < text.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, text.get(i));
        }
    }
}
