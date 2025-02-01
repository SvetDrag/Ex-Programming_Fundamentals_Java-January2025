package Methods;

import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractSumNum3(num1, num2, num3));

    }

    public static int sumOfNum1Num2 (int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int subtractSumNum3 (int num1, int num2, int num3) {
        int result = sumOfNum1Num2(num1, num2) - num3;

        return result;
    }
}
