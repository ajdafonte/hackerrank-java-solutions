package pt.caires.hackerrank;

import java.util.Scanner;


/**
 *
 */
public class Solution7
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args)
    {
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] arr = new int[n];

        final String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++)
        {
            final int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
