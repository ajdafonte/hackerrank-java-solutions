package pt.caires.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


/**
 *
 */
public class PatternSyntaxChecker
{
    private static String checkPattern(final String pattern)
    {
        String result = "Valid";
        try
        {
            Pattern.compile(pattern);
        }
        catch (final PatternSyntaxException e)
        {
            result = "Invalid";
        }
        return result;
    }

    public static void main(final String[] args)
    {
        final Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0)
        {
            final String pattern = in.nextLine();
            // task: check if syntax of pattern is valid - print Valid or Invalid
            System.out.println(checkPattern(pattern));
            testCases--;
        }
    }
}
