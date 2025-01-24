package Arrays;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        for (int position = 0; position < secondArray.length; position++) {
            
            String currentText = secondArray[position];

            for (int i = 0; i < firstArray.length; i++) {

                if (currentText.equals(firstArray[i])){
                    System.out.print(currentText + " ");
                }
            }
        }
        

    }
}
