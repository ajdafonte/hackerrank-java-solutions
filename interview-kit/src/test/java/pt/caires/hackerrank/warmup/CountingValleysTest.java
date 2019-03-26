package pt.caires.hackerrank.warmup;

import javafx.util.Pair;


/**
 *
 */
public class CountingValleysTest
{
    public static void main(final String[] args)
    {
        int failures = 0;

        final Pair<String, Integer>[] testCases = new Pair[] {
            new Pair("UDDDUDUU", 1),
            new Pair("DDUUUUDD", 1)
        };

        for (final Pair<String, Integer> testCase : testCases)
        {
            final String input = testCase.getKey();
            final Integer expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);

        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing " + CountingValleys.class.getSimpleName());
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final String input, final Integer expectedResult)
    {
        return checkResult(CountingValleys.countingValleys(input.length(), input), expectedResult);
    }

    private static int checkResult(final int result, final int expectedResult)
    {
        if (result != expectedResult)
        {
            System.err.println("Expected number of pairs '" + expectedResult + "' , got '" + result + "' ");
            return 1;
        }

        return 0;
    }
}
