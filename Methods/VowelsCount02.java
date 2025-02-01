package Methods;

import java.util.Scanner;

public class VowelsCount02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        vowelsCounter(input);


    }
    public static void vowelsCounter (String input){
        int lenght = input.length();
        int codeOfChar = 0;
        char word = ' ';
        int count = 0;

       // for (int position = 0; position < lenght; position++) {
       //     word = input.charAt(position);
       //     codeOfChar = word;

         //    if (codeOfChar >= 97 && codeOfChar <= 122) {
        //        count++;
        //    }

        //}

        for (int position = 0; position < lenght; position++) {
            word = input.charAt(position);
            codeOfChar = word;

            if (word == 'a' || word == 'e'|| word == 'i' || word == 'o' || word == 'u' || word == 'A' || word == 'E' || word == 'I' || word == 'O' || word == 'U') {
                count++;
            }

        }
        System.out.println(count);
    }
}
