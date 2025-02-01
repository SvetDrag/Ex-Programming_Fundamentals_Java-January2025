package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        getSmallestNum(num1, num2, num3);

    }

    public static void getSmallestNum (int num1, int num2, int num3) {
        int smallestNum = num1;

        if (num1 < num2 && num1 < num3) {
            smallestNum = num1;
        }
        if (num2 < num1 && num2 < num3) {
            smallestNum = num2;
        }
        if (num3 < num1 && num3 < num2) {
            smallestNum = num3;
        }
        System.out.println(smallestNum);


    }
}
