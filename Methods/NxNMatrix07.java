package Methods;

import java.util.Scanner;

public class NxNMatrix07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        
        int num = Integer.parseInt(scanner.nextLine());
        printNxNMatrix(num);
        
    }
    
    public static void printNxNMatrix (int num) {
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
