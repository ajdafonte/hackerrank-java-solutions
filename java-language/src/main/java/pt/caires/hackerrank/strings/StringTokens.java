package pt.caires.hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;


/**
 *
 */
public class StringTokens
{
    private static final String STR_REGEX = "[A-Za-z !,?._'@]+";
    private static final String TOKEN_REGEX = "[^A-Za-z]+";

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);
        final String s = scan.nextLine();
        // check if s matches the regular expression and contain the following length
        if (Pattern.matches(STR_REGEX, s))
        {
            // split the string in tokens
            final String trimStr = s.trim();
            if (trimStr.length() >= 1 && trimStr.length() <= (4 * Math.pow(10, 5)))
            {
                final String[] tokens = trimStr.split(TOKEN_REGEX);
                System.out.println(tokens.length);
                Arrays.stream(tokens).forEach(System.out::println);
            }
            else
            {
                System.out.println(trimStr.length());
            }
        }
        scan.close();
    }
}