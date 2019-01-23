package pt.caires.hackerrank.datastructures;

import java.util.Scanner;


/**
 *
 */
public class OneDimensionArray
{
    public static void main(final String[] args)
    {

        final Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();

        final int[] a = new int[n];
        java.util.stream.IntStream.range(0, n).forEach(x -> a[x] = scan.nextInt());
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
