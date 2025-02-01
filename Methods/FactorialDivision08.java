package Methods;

import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", Result(firstNum, secondNum));
    }

    public static double Result (int firstNum, int secondNum) {

        double factorialNum1 = 1;

        for (int i = 1; i <= firstNum ; i++) {

            factorialNum1 *= i;
        }

        double factorialNum2 = 1;

        for (int i = 1; i <= secondNum ; i++) {

            factorialNum2 *= i;
        }

        double result = factorialNum1 / factorialNum2;

        return result;
    }
}
