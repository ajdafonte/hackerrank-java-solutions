package pt.caires.hackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;


public class Solution6 {

    private static boolean isEvenNumber(final int num) {
        return num % 2 == 0;
    }

    public static void main(final String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution6. */
        try (final Scanner sc = new Scanner(System.in)) {
            final int numTestCases = sc.nextInt();
            // advance cursor to next line..
            sc.nextLine();
            IntStream.range(0, numTestCases).forEach(idx -> {
                final String testCase = sc.nextLine();
                final StringBuffer evenStr = new StringBuffer();
                final StringBuffer oddStr = new StringBuffer();
                IntStream.range(0, testCase.length()).forEach(jdx -> {
                    final char strChar = testCase.charAt(jdx);
                    if (isEvenNumber(jdx)) {
                        evenStr.append(strChar);
                    } else {
                        oddStr.append(strChar);
                    }
                });
                System.out.println(evenStr + " " + oddStr);
            });
        }
    }

}
