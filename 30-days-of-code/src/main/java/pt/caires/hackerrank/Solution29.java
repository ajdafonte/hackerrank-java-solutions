package pt.caires.hackerrank;

import java.util.Scanner;


public class Solution29
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args)
    {
        final int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++)
        {
            final String[] nk = scanner.nextLine().split(" ");

            final int n = Integer.parseInt(nk[0]);

            final int k = Integer.parseInt(nk[1]);

            int maxBitwiseVal = 0;

            for (int i = 1; i < n; i++)
            {
                for (int j = i + 1; j <= n; j++)
                {
                    final int currBitwise = i & j;
                    if (maxBitwiseVal < currBitwise && currBitwise < k)
                    {
                        maxBitwiseVal = currBitwise;
                    }
                }
            }
            System.out.println(maxBitwiseVal);
        }
        scanner.close();
    }
}
