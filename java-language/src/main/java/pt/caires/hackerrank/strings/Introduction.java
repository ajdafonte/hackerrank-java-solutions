package pt.caires.hackerrank.strings;

import java.util.Scanner;


/**
 *
 */
public class Introduction
{
//    Given two strings of lowercase English letters, A and B, perform the following operations:
//
//    Sum the lengths of A and B.
//    Determine if A is lexicographically larger than B (i.e.: does  A come before B in the dictionary?).
//    Capitalize the first letter in A and B and print them on a single line, separated by a space.

    private static int sumStringLength(final String v1, final String v2)
    {
        return v1.length() + v2.length();
    }

    private static StringBuilder toCamelCase(final String v1)
    {
        StringBuilder sb = null;
        if (v1 != null && v1.length() > 0)
        {
            final int startIdx = 0;
            sb = new StringBuilder(v1);
            sb.setCharAt(startIdx, Character.toUpperCase(v1.charAt(startIdx)));
        }
        return sb;
    }

    private static String isLexicographicallyGreater(final String v1, final String v2)
    {
        return v1.compareTo(v2) > 0 ? "Yes" : "No";
    }

    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            final String a = sc.next();
            final String b = sc.next();
            System.out.println(sumStringLength(a, b));
            System.out.println(isLexicographicallyGreater(a, b));
            System.out.println(toCamelCase(a) + " " + toCamelCase(b));
        }
    }
}
