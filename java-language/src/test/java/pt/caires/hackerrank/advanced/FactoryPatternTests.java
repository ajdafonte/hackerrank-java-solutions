package pt.caires.hackerrank.advanced;

import javafx.util.Pair;


/**
 *
 */
public class FactoryPatternTests
{
    public static void main(final String[] args)
    {
        int failures = 0;

        final Pair<String, Class>[] testCases = new Pair[] {
            new Pair<>("cake", Cake.class),
            new Pair<>("pizza", Pizza.class),
            new Pair<>("123", null),
            new Pair<>("", null)
        };

        for (final Pair<String, Class> testCase : testCases)
        {
            final String input = testCase.getKey();
            final Class expected = testCase.getValue();
            failures += executeTest(input, expected);
        }

        if (failures > 0)
        {
            throw new RuntimeException("Incurred " + failures + " failures while testing precision");
        }
        else
        {
            System.out.println("All tests are OK!!");
        }
    }

    private static int executeTest(final String input, final Class expectedResult)
    {
        final FoodFactory factory = new FoodFactory();
        final Food food = factory.getFood(input);

        return checkResult(food, expectedResult);
    }

    private static int checkResult(final Food food, final Class expected)
    {
        if (food == null && expected != null)
        {
            System.err.println("A Food of type " + expected.getSimpleName() + " is not supposed to be created");
            return 1;
        }

        if (food != null && food.getClass() != expected)
        {
            System.err.println("Expected a Food of type " + expected.getSimpleName() + ", got a Food of type " + food.getClass().getSimpleName());
            return 1;
        }

        return 0;
    }
}
