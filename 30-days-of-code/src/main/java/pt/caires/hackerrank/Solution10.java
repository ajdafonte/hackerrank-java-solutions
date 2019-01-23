package pt.caires.hackerrank;

//Complete this code or write your own from scratch

import java.util.Scanner;


/**
 *
 */
public class Solution10
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args)
    {
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final String binaryNum = Integer.toBinaryString(n);
        int cnt = 0;

        for (int i = 0; i < binaryNum.length(); i++)
        {
            int auxCnt = 0;
            final int chatAtI = Character.getNumericValue(binaryNum.charAt(i));
            if (chatAtI == 1)
            {
                auxCnt++;
                for (int j = i + 1; j < binaryNum.length(); j++)
                {
                    final int chatAtJ = Character.getNumericValue(binaryNum.charAt(j));
                    if (chatAtJ == 1)
                    {
                        auxCnt++;
                    }
                    else
                    {
                        break;
                    }
                }
            }

            if (cnt < auxCnt)
            {
                cnt = auxCnt;
            }
        }
        System.out.println(cnt);

        scanner.close();
    }
}
