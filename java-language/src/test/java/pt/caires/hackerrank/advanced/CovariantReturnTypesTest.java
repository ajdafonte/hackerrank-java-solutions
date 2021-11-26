package pt.caires.hackerrank.advanced;

import javafx.util.Pair;


/**
 *
 */
public class CovariantReturnTypesTest {

    public static void main(final String[] args) {
        int failures = 0;

        final Pair<String, String>[] testCases = new Pair[]{
                new Pair("WestBengal", "Jasmine"),
                new Pair("AndhraPradesh", "Lily"),
                new Pair("Region", "I have many names and types."),
                new Pair(null, null)
        };

        for (final Pair<String, String> testCase : testCases) {
            final Region inputRegion = discoverRegion(testCase.getKey());
            final String expectedResult = testCase.getValue();
            failures += executeTest(inputRegion, expectedResult);

        }

        if (failures > 0) {
            throw new RuntimeException(
                    "Incurred " + failures + " failures while testing " + CovariantReturnTypes.class.getSimpleName());
        } else {
            System.out.println("All tests are OK!!");
        }
    }

    private static Region discoverRegion(final String input) {
        Region region = null;
        if (input != null) {
            switch (input) {
                case "WestBengal":
                    region = new WestBengal();
                    break;
                case "AndhraPradesh":
                    region = new AndhraPradesh();
                    break;
                case "Region":
                    region = new Region();
                    break;
            }
        }

        return region;
    }

    private static int executeTest(final Region inputRegion, final String expectedResult) {
        if (inputRegion == null && expectedResult != null) {
            System.err.println("Expected a Flower with a null name, got a Flower with name " + expectedResult);
            return 1;
        }

        if (inputRegion != null) {
            final Flower flower = inputRegion.yourNationalFlower();
            return checkResult(flower.whatsYourName(), expectedResult);
        }

        return 0;
    }

    private static int checkResult(final String input, final String expectedResult) {
        if (!input.equals(expectedResult)) {
            System.err.println(
                    "Expected a Flower with name '" + expectedResult + "' , got a Flower with name '" + input + "' ");
            return 1;
        }

        return 0;
    }

}
