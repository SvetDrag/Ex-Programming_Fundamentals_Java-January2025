package AssociativeArrays;


import java.util.*;

public class Courses05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String> > studentsList = new LinkedHashMap<>();
        int countStudents = 0;

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];



            studentsList.putIfAbsent(courseName, new ArrayList<>());
            studentsList.get(courseName).add(studentName);


            input = scanner.nextLine();


        }


        for (Map.Entry<String, List<String>> entry : studentsList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (String student : entry.getValue()) {
                System.out.println("-- " + student);
            }
        }



    }
}
