package pt.caires.hackerrank.warmup;

import javafx.util.Pair;


/**
 *
 */
public class RepeatedStringTest
{
    public static void main(final String[] args)
    {
        int failures = 0;

        final Pair<Pair<String, Long>, Long>[] testCases = new Pair[] {
            new Pair(new Pair<>("abcac", 10L), 4L),
            new Pair(new Pair<>("aba", 10L), 7L),
            new Pair(new Pair<>("a", 1000000000000L), 1000000000000L),
            new Pair(new Pair<>("bbbaaaaa", 11L), 5L),
            new Pair(new Pair<>("abab", 2L), 1L)
        };

        for (final Pair<Pair<String, Long>, Long> testCase : testCases)
        {
            final Pair<String, Long> input = testCase.getKey();
            final Long expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);

        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing " + RepeatedString.class.getSimpleName());
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final Pair<String, Long> input, final Long expectedResult)
    {
        final String str = input.getKey();
        final Long numLetters = input.getValue();
        final long result = RepeatedString.repeatedString(str, numLetters);

        if (result != expectedResult)
        {
            System.err.println(
                "For test case " + input.toString() + " the expected number of repeated a characters should be'" + expectedResult + "', but got '"
                    + result
                    + "' ");
            return 1;
        }
        return 0;
    }
}
