package TextProcessing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtractFile03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int lastSlashIndex =  input.lastIndexOf("\\");
        int dotIndex = input.lastIndexOf(".");

        String file = input.substring(lastSlashIndex + 1, dotIndex);
        String extension = input.substring(dotIndex + 1);

        System.out.println("File name: " + file);
        System.out.println("File extension: " + extension);

    }
}
