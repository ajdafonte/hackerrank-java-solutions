package pt.caires.hackerrank;

import java.util.Scanner;


/**
 * Created by aleja on 23/01/2019.
 */
public class Solution20
{
    public static void main(final String[] args)
    {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int totalSwaps = 0;
        for (int i = 0; i < n; i++)
        {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++)
            {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1])
                {
                    final int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    // swap(a[j], a[j + 1]);
                    numberOfSwaps++;
                }
            }

            totalSwaps += numberOfSwaps;

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0)
            {
                break;
            }
        }

        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
