package ObjectsAndClasses.Students04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<Students> users = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double age = Double.parseDouble(input[2]);

            Students students = new Students(firstName, lastName, age);

            users.add(students);

        }
        users.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students students : users){
            System.out.printf("%s %s: %.2f%n", students.getFirstName(), students.getLastName(), students.getGrade() );
        }

    }
}
