package Methods;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean firstValid = isValid1(input);
        boolean secondValid = isValid2(input);
        boolean trirdValid = isValid3(input);

        if (!firstValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!secondValid) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!trirdValid) {
            System.out.println("Password must have at least 2 digits");
        }

        if (trirdValid && secondValid && firstValid) {
            System.out.println("Password is valid");
        }




    }

    public static boolean isValid1 (String input) {

        int legth = input.length();

        if (legth >= 6 && legth <= 10){
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean isValid2 (String input) {

        for (char symbol : input.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid3 (String input) {
        int numDigits = 0;
        for (char symbol : input.toCharArray()){
            if (symbol >= 48 && symbol <= 57) {
                numDigits++;
            }
        }
        if (numDigits >= 2){
            return true;
        }
        return false;
    }


}
