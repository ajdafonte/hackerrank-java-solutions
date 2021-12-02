package pt.caires.hackerrank.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;


public class Loops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        final int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        IntStream.rangeClosed(1, 10)
                .forEach(num -> System.out.println(N + " x " + num + " = " + N * num));

        scanner.close();
    }

}
