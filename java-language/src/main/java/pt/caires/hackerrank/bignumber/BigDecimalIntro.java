package pt.caires.hackerrank.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;


class BigDecimalIntro {

    public static void main(final String[] args) {
        //Input
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Tasks:
        // - sort array in descending order (If two numbers represent numerically equivalent values (e.g., .1 and 0.1),
        //   then they must be listed in the same order as they were received as input).
        // - Each number must be printed in the exact same format as it was read from stdin
        s = getRealNumbersInDescOrder(s);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    public static String[] getRealNumbersInDescOrder(String[] input) {
        return Arrays.stream(input)
                .filter(byNonBlank())
                .sorted(byDescOrder())
                .toArray(String[]::new);
    }

    private static Predicate<String> byNonBlank() {
        return element -> !Objects.isNull(element) && !element.trim().isEmpty();
    }

    private static Comparator<String> byDescOrder() {
        return (elem1, elem2) -> {
            BigDecimal number1 = new BigDecimal(elem1);
            BigDecimal number2 = new BigDecimal(elem2);
            return number2.compareTo(number1);
        };
    }

}
