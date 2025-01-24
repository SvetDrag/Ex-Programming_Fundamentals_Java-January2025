package Arrays;

import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {

       // System.out.println("Hello, world!");
        //  int n = Integer.parseInt(scanner.nextLine());
        //
        //        int [] number = new int[n];
        //
        //        for (int i = 0; i  < n; i++) {
        //            int input = Integer.parseInt(scanner.nextLine());
        //            number[i] = input;
        //        }

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int [] people = new int[n];

        for (int i = 0; i < n ; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            sum += people [i];
            //System.out.print(i + " ");
        }
        for (int num : people) {
            System.out.print(num + " ");
        }
       // System.out.println(people [0] + " " + people [1] + " " + people [2] + " ");
        System.out.printf("%n%d", sum);

    }
}
