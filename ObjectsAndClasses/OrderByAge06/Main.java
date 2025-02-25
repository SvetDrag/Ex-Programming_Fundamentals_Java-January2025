package ObjectsAndClasses.OrderByAge06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<Elements> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String name = input.split(" ")[0];
            int ID = Integer.parseInt(input.split(" ")[1]);
            int age = Integer.parseInt(input.split(" ")[2]);

            Elements elements = new Elements(name, ID, age);

            people.add(elements);

            input = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Elements::getAge));
       // people.sort(Comparator.comparing(Elements::getAge).reversed());

        for (Elements elements : people){
            System.out.printf("%s with ID: %d is %d years old.%n", elements.getName(), elements.getID(), elements.getAge());
        }

    }
}
