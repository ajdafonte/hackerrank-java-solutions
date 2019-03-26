package pt.caires.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 */
public class CountingValleys
{
    // Complete the countingValleys function below.
    static int countingValleys(final int n, final String s)
    {
        int level = 0;
        int numValleys = 0;
        for (int i = 0; i < n; i++)
        {
            final char mov = s.charAt(i);
            if (mov == 'U')
            {
                level++;
            }
            if (mov == 'D')
            {
                level--;
            }

            if (level == 0 & mov == 'U')
            {
                numValleys++;
            }
        }

        return numValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException
    {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final String s = scanner.nextLine();

        final int result = countingValleys(n, s);

        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
