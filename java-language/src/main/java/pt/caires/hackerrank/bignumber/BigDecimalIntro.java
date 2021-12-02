package pt.caires.hackerrank.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


// TODO: 02/12/2021 Refactor this approach
class BigDecimalIntro {

    // Other option - for other approach to the problem
    private static String[] orderedRealNumberStrings(final String[] numStrs) {
        final BigDecimal[] decimals = Arrays.stream(numStrs)
                .filter(x -> x != null)
                .map(BigDecimal::new)
                .sorted(Comparator.reverseOrder())
                .toArray(BigDecimal[]::new);
        Arrays.stream(decimals).forEach(System.out::println);

        return Arrays.stream(decimals)
                .map(BigDecimal::toPlainString)
                .toArray(String[]::new);
    }

    public static void main(final String[] args) {
        //Input
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        // Tasks:
        // - sort array in descending order (If two numbers represent numerically equivalent values (e.g., .1 and 0.1), then they must be listed in the same order as they were received as input).
        // - Each number must be printed in the exact same format as it was read from stdin
//        s = orderedRealNumberStrings(s);
        s = Arrays.stream(s)
                .filter(x -> x != null)
                .sorted((o1, o2) -> {
                    BigDecimal decimal1 = new BigDecimal(o1);
                    BigDecimal decimal2 = new BigDecimal(o2);
                    return decimal2.compareTo(decimal1);
                })
                .toArray(String[]::new);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
