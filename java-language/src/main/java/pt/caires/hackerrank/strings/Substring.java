package pt.caires.hackerrank.strings;

import java.util.Scanner;


/**
 *
 */
public class Substring
{
    public static void main(final String[] args)
    {
        final Scanner in = new Scanner(System.in);
        final String S = in.next();
        final int start = in.nextInt();
        final int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
