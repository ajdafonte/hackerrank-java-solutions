package pt.caires.hackerrank;

import java.util.Arrays;
import java.util.Scanner;


class Difference
{
    private final int[] elements;
    int maximumDifference;

    // Add your code here
    Difference(final int[] elements)
    {
        this.elements = elements;
    }

    void computeDifference()
    {
        final int min = Arrays.stream(elements).min().getAsInt();
        final int max = Arrays.stream(elements).max().getAsInt();
        final int diff = max - min;
        this.maximumDifference = Math.abs(diff);
    }

} // End of Difference class

/**
 * Created by aleja on 23/01/2019.
 */
public class Solution14
{
    public static void main(final String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();

        final Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
