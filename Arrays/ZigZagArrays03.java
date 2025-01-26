package Arrays;

import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int  [] line1 = new int[n];
        int  [] line2 = new int[n];
        
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            //int [] input = new int[i];
            String [] input = scanner.nextLine().split(" ");
            int firstNum = Integer.parseInt(input [0]);
            int secondNum = Integer.parseInt(input [1]);

                sum++;
                if (sum % 2 == 0) {
                    line1 [sum - 1] = firstNum;
                    line2 [sum - 1] = secondNum;


                }
                else {
                    line1 [sum - 1] = secondNum;
                    line2 [sum - 1] = firstNum;
                }
           // String [] input = scanner.nextLine().split(" ");
            //line1 = input [0];

        }

        for (int i : line2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : line1) {
            System.out.print(i + " ");
        }



    }
}
