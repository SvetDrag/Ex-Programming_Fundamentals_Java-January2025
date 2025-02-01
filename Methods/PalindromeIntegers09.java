package Methods;

import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            //boolean isPalindrome2 = isPalindrome(input);
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();

        }

    }

    public static boolean isPalindrome (String input) {
        String reversed = "";
        for (int i = input.length()-1; i >= 0 ; i--) {

           // char symbol = input.charAt(i);
            reversed += input.charAt(i);
        }

        return reversed.equals(input);


    }
}
