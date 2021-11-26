package pt.caires.hackerrank.advanced;

import javafx.util.Pair;

import java.security.NoSuchAlgorithmException;


/**
 *
 */
public class SHA256Test {

    public static void main(final String[] args) throws NoSuchAlgorithmException {
        int failures = 0;

        final Pair<String, String>[] testCases = new Pair[]{
                new Pair("HelloWorld", "872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4"),
                new Pair("Javarmi123", "f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678"),
                new Pair("zepassarinho", "65379e13682aa4b6b96e586dd893560b30ec43b9a407becde7c1a71f0d45bd6b"),
                new Pair(" ", "Constraint Violated"),
                new Pair("qwertyuioplkjhgfdsazxc", "Constraint Violated"),
                new Pair("cr7@goal.com", "Constraint Violated"),
                new Pair("K1t4fo0V", "0a979e43f4874eb24b740c0157994e34636eed0425688161cc58e8b26b1dcf4e"),
                new Pair("yxPX0fbIKHvjHo180", "074690988f8d3e8e45840f7502efd2edde63a88c299a88e0923e7ed4abec1835")
        };

        for (final Pair<String, String> testCase : testCases) {
            final String input = testCase.getKey();
            final String expectedResult = testCase.getValue();
            failures += executeTest(input, expectedResult);
        }

        if (failures > 0) {
            throw new RuntimeException(
                    "Incurred " + failures + " failures while testing " + SHA256.class.getSimpleName());
        } else {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final String input, final String expectedResult) throws NoSuchAlgorithmException {
        final String result = SHA256.handleSha256Hash(input);
        if (!result.equals(expectedResult)) {
            System.err.println("Expected result '" + expectedResult + "' , got the following result '" + result + "' ");
            return 1;
        }

        return 0;
    }

}
