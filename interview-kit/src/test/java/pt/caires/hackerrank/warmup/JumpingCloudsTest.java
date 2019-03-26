package pt.caires.hackerrank.warmup;

import java.util.Arrays;

import javafx.util.Pair;


/**
 *
 */
public class JumpingCloudsTest
{
    public static void main(final String[] args)
    {
        int failures = 0;

        final Pair<int[], Integer>[] testCases = new Pair[] {
            new Pair(new int[] {0, 1, 0, 0, 0, 1, 0}, 3),
            new Pair(new int[] {0, 0, 0, 0, 1, 0}, 3),
            new Pair(new int[] {0, 0, 1, 0, 0, 1, 0}, 4),
            new Pair(new int[] {0, 0, 0, 0}, 2),
            new Pair(new int[] {0, 1, 0, 1, 0, 1, 0, 0, 1, 0}, 5)
        };

        for (final Pair<int[], Integer> testCase : testCases)
        {
            final int[] input = testCase.getKey();
            final Integer expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);

        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing " + JumpingClouds.class.getSimpleName());
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final int[] input, final Integer expectedResult)
    {
        final int result = JumpingClouds.jumpingOnClouds(input);

        if (result != expectedResult)

        {
            System.err.println(
                "For test case " + Arrays.toString(input) + " the expected number of pairs should be'" + expectedResult + "', but got '" + result
                    + "' ");
            return 1;
        }
        return 0;
    }
}

