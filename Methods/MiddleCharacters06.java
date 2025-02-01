package Methods;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleCharacter(input);

    }

    public static void printMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
                //2 middle characters
            //first character position:
            char first = input.charAt((input.length()/2) - 1);
            char second = input.charAt(input.length()/2);
            System.out.printf("%c%c", first, second);
        }
        else {
            //1 middle character
            char first = input.charAt(input.length()/2);
            System.out.println(first);
        }
    }
}
