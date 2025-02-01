package Methods;

import java.util.Scanner;

public class TopInteger10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) {
            boolean isValidFisrt = isValid1(i);
            boolean isValidSecond = isValid2(i);

            if (isValidFisrt && isValidSecond) {
                System.out.println(i);
            }
        }

    }

    public static boolean isValid1 (int i) {

        int sum = 0;
        while (i > 0) {
            // 1 - взимам последната цифра
            int lastDigit = i % 10;
            // 2 - прибавям цифрата към sum
            sum += lastDigit;
            // 3 - премахвам последната цифра от числот
            i = i / 10; // num /= 10;
        }

        return sum % 8 == 0;

    }

    public static boolean isValid2 (int i){
        int sumDigits = 0;
        int lastDigit = 0;
        while (i > 0) {
            lastDigit += i % 10;
            if (lastDigit % 2 != 0){
                return true;
            }
            i /= 10;

        }
        return false;

    }
}
