package AssociativeArrays;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String name = "";
        double grade = 0.0;
        Map<String, Double> studentsGrade = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            name = scanner.nextLine();
            grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(name)){
                studentsGrade.put(name, grade);
            }
            else {
                double newGrade = (studentsGrade.get(name) + grade) / 2;
                studentsGrade.put(name, newGrade);
            }

        }


        for (Map.Entry<String, Double> entry : studentsGrade.entrySet()){

            if (entry.getValue() >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }

        }





    }
}
