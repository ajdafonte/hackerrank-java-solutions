package pt.caires.hackerrank.datastructures;

import javafx.util.Pair;


/**
 *
 */
public class JavaStackTests
{
    public static void main(final String[] args)
    {
        int failures = 0;

        final Pair<String, Boolean>[] testCases = new Pair[] {
            new Pair("{}()", Boolean.TRUE),
            new Pair("[{()}]", Boolean.TRUE),
            new Pair("({()})", Boolean.TRUE),
            new Pair("[]", Boolean.TRUE),
            new Pair("{}(", Boolean.FALSE),
            new Pair("({)}", Boolean.FALSE),
            new Pair("[[", Boolean.FALSE),
            new Pair("}{", Boolean.FALSE)
        };

        for (final Pair<String, Boolean> testCase : testCases)
        {
            final String input = testCase.getKey();
            final Boolean expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);
        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing " + JavaStack.class.getSimpleName());
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final String input, final Boolean expectedResult)
    {
        final Boolean result = JavaStack.isBalanced(input);
        if (!result.equals(expectedResult))
        {
            System.err.println("For input '" + input + "', got the following result '" + result + "'. Expected result '" + expectedResult + "'.");
            return 1;
        }

        return 0;
    }

}
