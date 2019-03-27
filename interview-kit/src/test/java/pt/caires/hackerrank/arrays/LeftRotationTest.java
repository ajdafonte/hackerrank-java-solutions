package pt.caires.hackerrank.arrays;

import java.util.Arrays;

import javafx.util.Pair;


/**
 *
 */
public class LeftRotationTest
{
    public static void main(final String[] args)
    {
        int failures = 0;

        final Pair<Pair<int[], Integer>, int[]>[] testCases = new Pair[] {
            new Pair(new Pair<>(new int[] {1, 2, 3, 4, 5}, 2), new int[] {3, 4, 5, 1, 2}),
            new Pair(new Pair<>(new int[] {1, 2, 3, 4, 5}, 4), new int[] {5, 1, 2, 3, 4}),
            new Pair(new Pair<>(new int[] {1, 2, 3, 4, 5}, 0), new int[] {1, 2, 3, 4, 5})
        };

        for (final Pair<Pair<int[], Integer>, int[]> testCase : testCases)
        {
            final Pair<int[], Integer> input = testCase.getKey();
            final int[] expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);

        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing " + LeftRotation.class.getSimpleName());
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final Pair<int[], Integer> inputData, final int[] expectedResult)
    {
        final int[] input = inputData.getKey();
        final int numRotations = inputData.getValue();
        final int[] result = LeftRotation.rotLeft(input, numRotations);

        if (!Arrays.equals(result, expectedResult))
        {
            System.err.printf("For test case '%s' the expected result after %d rotations is '%s', but got '%s' %n",
                Arrays.toString(input),
                numRotations,
                Arrays.toString(expectedResult),
                Arrays.toString(result));
            return 1;
        }
        return 0;
    }

}
