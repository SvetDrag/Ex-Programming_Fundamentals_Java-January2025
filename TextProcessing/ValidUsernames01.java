package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(", ");

        for (String username : input) {

            boolean validUsername = validateUsername(username);

            if (validUsername) {
                System.out.println(username);
            }
        }

    }

    private static boolean validateUsername(String username) {


        if (username.length() < 3 || username.length() > 16) {
            return false;
        }



        for (char symbol : username.toCharArray()) {

            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }

}