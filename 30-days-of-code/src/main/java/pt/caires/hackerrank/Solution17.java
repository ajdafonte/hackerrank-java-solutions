package pt.caires.hackerrank;

import java.util.Scanner;


class Calculator2
{
    int power(final int n, final int p) throws Exception
    {
        if ((n < 0) || (p < 0))
        {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}

/**
 * Created by aleja on 23/01/2019.
 */
public class Solution17
{
    public static void main(final String[] args)
    {

        final Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0)
        {

            final int n = in.nextInt();
            final int p = in.nextInt();
            final Calculator2 myCalculator = new Calculator2();
            try
            {
                final int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (final Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
