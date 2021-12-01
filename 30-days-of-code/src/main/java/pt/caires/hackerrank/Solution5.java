package pt.caires.hackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;


public class Solution5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        IntStream.rangeClosed(1, 10).forEach(i -> {
            final int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        });

        scanner.close();
    }

}
