package pt.caires.hackerrank.advanced;

import javafx.util.Pair;


/**
 *
 */
public class PrimeCheckerTest {

    public static void main(final String[] args) {
        int failures = 0;

        final Pair<Integer[], String>[] testCases = new Pair[]{
                new Pair(new Integer[]{2}, "2 "),
                new Pair(new Integer[]{2, 1}, "2 "),
                new Pair(new Integer[]{2, 1, 3, 4, 5}, "2 3 5 "),
                new Pair(new Integer[]{1}, ""),
                new Pair(new Integer[]{2, 3, 4, 5, 6, 7, 8, 9}, "2 3 5 7 "),
                new Pair(new Integer[]{10, 11, 22, 23, 12, 13}, "11 23 13 ")
        };

        for (final Pair<Integer[], String> testCase : testCases) {
            final Integer[] inputValues = testCase.getKey();
            final String expectedResult = testCase.getValue();
            failures += executeTest(inputValues, expectedResult);

        }

        if (failures > 0) {
            throw new RuntimeException(
                    "Incurred " + failures + " failures while testing " + Prime.class.getSimpleName());
        } else {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final Integer[] inputValues, final String expectedResult) {
        final Prime p = new Prime();
        final StringBuilder sb = new StringBuilder();
        for (final Integer inputVal : inputValues) {
            if (p.isPrime(inputVal)) {
                sb.append(inputVal).append(" ");
            }
        }

        return checkResult(sb.toString(), expectedResult);
    }

    private static int checkResult(final String result, final String expectedResult) {
        if (!result.equals(expectedResult)) {
            System.err.println("Expected result '" + expectedResult + "' , got the following result '" + result + "' ");
            return 1;
        }

        return 0;
    }

}
