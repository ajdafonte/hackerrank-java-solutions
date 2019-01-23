package pt.caires.hackerrank.introduction;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 */
public class Loops2
{
    private static int powInt(final int a, final int b)
    {
        return (int) Math.pow(a, b);
    }

    private static int recSeries(final int n, final int a, final int b)
    {
        if (n == 0)
        {
            return a + powInt(2, n) * b;
        }
        else
        {
            return recSeries(n - 1, a, b) + powInt(2, n) * b;
        }
    }

    public static void main(final String[] argh)
    {
        final Scanner in = new Scanner(System.in);
        final int t = in.nextInt();
        for (int i = 0; i < t; i++)
        {
            final int a = in.nextInt();
            final int b = in.nextInt();
            final int n = in.nextInt();
            final int[] series = new int[n];
            for (int j = 0; j < n; j++)
            {
                series[j] = recSeries(j, a, b);
            }
            Arrays.stream(series).forEach(num -> System.out.print(num + " "));
            System.out.println();
        }
        in.close();
    }
}
