package pt.caires.hackerrank;

import java.util.Scanner;


/**
 *
 */
public class Solution16
{
    public static void main(final String[] args)
    {
        final Scanner in = new Scanner(System.in);
        final String S = in.next();

        try
        {
            System.out.println(Integer.parseInt(S));
        }
        catch (final NumberFormatException e)
        {
            System.out.println("Bad String");
        }
    }
}
