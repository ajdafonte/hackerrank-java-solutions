package pt.caires.hackerrank.advanced;

import java.security.NoSuchAlgorithmException;

import javafx.util.Pair;


/**
 *
 */
public class MD5Tests
{
    public static void main(final String[] args) throws NoSuchAlgorithmException
    {
        int failures = 0;

        final Pair<String, String>[] testCases = new Pair[] {
            new Pair("HelloWorld", "68e109f0f40ca72a15e05cc22786f8e6"),
            new Pair("Javarmi123", "2da2d1e0ce7b4951a858ed2d547ef485"),
            new Pair("zepassarinho", "2cd1be5eef5313196d4a5450d10cab39"),
            new Pair(" ", "Constraint Violated"),
            new Pair("qwertyuioplkjhgfdsazxc", "Constraint Violated"),
            new Pair("cr7@goal.com", "Constraint Violated")
        };

        for (final Pair<String, String> testCase : testCases)
        {
            final String input = testCase.getKey();
            final String expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);
        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing " + MD5.class.getSimpleName());
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final String input, final String expectedResult) throws NoSuchAlgorithmException
    {
        final String result = MD5.handleMd5Hash(input);
        if (!result.equals(expectedResult))
        {
            System.err.println("Expected result '" + expectedResult + "' , got the following result '" + result + "' ");
            return 1;
        }

        return 0;
    }
}
