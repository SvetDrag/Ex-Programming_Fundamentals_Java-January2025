package ObjectsAndClasses.Articles02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).toList();

        int num = Integer.parseInt(scanner.nextLine());

        String title = input.get(0);
        String content = input.get(1);
        String author = input.get(2);

    Articles articles = new Articles(title, content, author);

        for (int i = 0; i < num; i++) {

            String command = scanner.nextLine();
            String method = command.split(": ")[0];
            String text = command.split(": ")[1];

            if (method.equals("Edit")){
                articles.edit(text);
            }
            else if (method.equals("ChangeAuthor")){
                articles.changeAuthor(text);
            }
            else if (method.equals("Rename")){
                articles.rename(text);
            }

        }
      //  toString(title, content, author);

        System.out.println(articles.toString());

    }

    //public static void toString (String title, String content, String author){
//
     //    System.out.println(title + " - " + content + " - " + author);
//
    //}
}
