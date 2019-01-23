package pt.caires.hackerrank.datastructures;

import java.util.Scanner;


/**
 *
 */
public class TwoDimensionArray
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args)
    {
        final int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++)
        {
            final String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++)
            {
                final int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        calculateHourglass(arr);

        scanner.close();
    }

    private static void calculateHourglass(final int[][] arr)
    {
        int finalSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++)
        {
            int currSum = 0;
            for (int j = 0; j < 4; j++)
            {
                currSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                    + arr[i + 1][j + 1] +
                    arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if (currSum >= finalSum)
                {
                    finalSum = currSum;
                }
            }

        }

        System.out.println(finalSum);
    }
}
