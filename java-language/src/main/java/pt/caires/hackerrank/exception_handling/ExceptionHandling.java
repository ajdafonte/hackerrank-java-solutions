package pt.caires.hackerrank.exception_handling;

import java.util.Scanner;


public class ExceptionHandling
{
    private static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(final String[] args)
    {
        while (in.hasNextInt())
        {
            final int n = in.nextInt();
            final int p = in.nextInt();

            try
            {
                System.out.println(my_calculator.power(n, p));
            }
            catch (final Exception e)
            {
                System.out.println(e);
            }
        }
    }

    private static class MyCalculator
    {
        int power(final int n, final int p) throws Exception
        {
            if (n < 0 || p < 0)
            {
                throw new Exception("n or p should not be negative.");
            }

            if (n == 0 && p == 0)
            {
                throw new Exception("n and p should not be zero.");
            }

            return (int) Math.pow(n, p);
        }
    }
}
