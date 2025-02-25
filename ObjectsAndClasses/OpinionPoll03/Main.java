package ObjectsAndClasses.OpinionPoll03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> users = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).toList();

            String name = input.get(0);
            int age = Integer.parseInt(input.get(1));

            Person person = new Person(name, age);

            if (person.getAge() > 30){
                users.add(person);
            }



        }

        for (Person person : users){
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
