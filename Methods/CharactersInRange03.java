package Methods;

import java.util.Scanner;

public class CharactersInRange03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String symbol1 = scanner.nextLine();
        String symbol2 = scanner.nextLine();

        printCharactersBetween(symbol1, symbol2);


    }

    public static void printCharactersBetween (String symbol1, String symbol2) {

        char start = symbol1.charAt(0);
        char end = symbol2.charAt(0);

        if (start < end) {
            int num = start + 1;
            int finale = end;
            while (num < finale) {
                char printedChar = (char) num;
                System.out.print(printedChar + " ");
                num++;
            }
        }
        else if (start > end) {
            int num = end + 1;
            int finale = start;
            while (num < finale) {
                char printedChar = (char) num;
                System.out.print(printedChar + " ");
                num++;
            }
        }

       // while (num < finale) {
       //     char printedChar = (char) num;
       //     System.out.print(printedChar + " ");
       //     num++;
        //}

    }
}
