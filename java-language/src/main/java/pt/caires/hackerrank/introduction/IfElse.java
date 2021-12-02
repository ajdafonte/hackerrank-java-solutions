package pt.caires.hackerrank.introduction;

import java.util.Scanner;


public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getWeirdnessLevel(int number) {
        return isWeirdNumber(number) ? "Weird" : "Not Weird";
    }

    private static boolean isOddNumber(int num) {
        return num % 2 != 0;
    }

    private static boolean isWeirdNumber(int number) {
        return isOddNumber(number) || (number >= 6 && number <= 20);
    }

    public static void main(final String[] args) {
        final int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(getWeirdnessLevel(N));

        scanner.close();
    }

}
