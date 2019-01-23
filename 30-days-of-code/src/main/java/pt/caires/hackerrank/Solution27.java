package pt.caires.hackerrank;

import java.util.Arrays;
import java.util.LinkedHashSet;


/**
 *
 */
public class Solution27
{
    private static int minimum_index(final int[] seq)
    {
        if (seq.length == 0)
        {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i)
        {
            if (seq[i] < seq[min_idx])
            {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray
    {
        static int[] get_array()
        {
            // complete this function
            return new int[0];
        }
    }

    static class TestDataUniqueValues
    {
        static int[] get_array()
        {
            // complete this function
            return new int[] {1, 2};

        }

        static int get_expected_result()
        {
            // complete this function
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums
    {
        static int[] get_array()
        {
            // complete this function
            return new int[] {2, 1, 1};
        }

        static int get_expected_result()
        {
            // complete this function
            return 1;
        }
    }

    private static void TestWithEmptyArray()
    {
        try
        {
            final int[] seq = TestDataEmptyArray.get_array();
            minimum_index(seq);
        }
        catch (final IllegalArgumentException e)
        {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    private static void TestWithUniqueValues()
    {
        final int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2)
        {
            throw new AssertionError("less than 2 elements in the array");
        }

        final Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i)
        {
            tmp[i] = seq[i];
        }
        if (!((new LinkedHashSet<>(Arrays.asList(tmp))).size() == seq.length))
        {
            throw new AssertionError("not all values are unique");
        }

        final int expected_result = TestDataUniqueValues.get_expected_result();
        final int result = minimum_index(seq);
        if (result != expected_result)
        {
            throw new AssertionError("result is different than the expected result");
        }
    }

    private static void TestWithExactlyTwoDifferentMinimums()
    {
        final int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2)
        {
            throw new AssertionError("less than 2 elements in the array");
        }

        final int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2])))
        {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        final int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        final int result = minimum_index(seq);
        if (result != expected_result)
        {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(final String[] args)
    {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }

}
