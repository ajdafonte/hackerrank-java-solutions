package pt.caires.hackerrank;

import java.util.Scanner;


public class Solution3 {

    private static final Scanner scanner = new Scanner(System.in);

    private static boolean isOdd(final int num) {
        return num % 2 != 0;
    }

    private static boolean inRange(final int bottom, final int top, final int num) {
        return (bottom <= num) && (num <= top);
    }

    public static void main(final String[] args) {
        final int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (isOdd(N) || inRange(6, 20, N)) {
            System.out.println("Weird");
        } else if (inRange(2, 5, N) || N > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

}
