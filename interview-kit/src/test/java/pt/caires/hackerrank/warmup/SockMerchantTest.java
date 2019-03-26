package pt.caires.hackerrank.warmup;

import javafx.util.Pair;


/**
 *
 */
public class SockMerchantTest
{
    public static void main(final String[] args)
    {
        int failures = 0;

        final Pair<int[], Integer>[] testCases = new Pair[] {
            new Pair(new int[] {1, 2, 1, 2, 1, 3, 2}, 2),
            new Pair(new int[] {1, 2, 1, 2, 1, 2, 1, 2}, 4),
            new Pair(new int[] {1, 2, 3, 4, 5}, 0)
        };

        for (final Pair<int[], Integer> testCase : testCases)
        {
            final int[] input = testCase.getKey();
            final Integer expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);

        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing " + SockMerchant.class.getSimpleName());
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final int[] input, final Integer expectedResult)
    {
        return checkResult(SockMerchant.sockMerchant(input.length, input), expectedResult);
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
