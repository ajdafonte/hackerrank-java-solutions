package pt.caires.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 */
public class RepeatedString
{
    private static long numberOfCharOccurrences(final String str, final char c)
    {
        return str.chars().filter(value -> value == c).count();
    }

    // Complete the repeatedString function below.
    static long repeatedString(final String s, final long n)
    {
        final int currStrLength = s.length();
        long result;

        if (n < currStrLength)
        {
            return numberOfCharOccurrences(s.substring(0, (int) n), 'a');
        }
        else
        {
            final long numRepetitions = (n / currStrLength);
            final long numOfLastChars = n % currStrLength;

            final long numUnitOccurrences = numberOfCharOccurrences(s, 'a');
            result = numUnitOccurrences * numRepetitions;

            // for the case of last iteration if is necessary to check a substring
            if (numOfLastChars != 0)
            {
                result += numberOfCharOccurrences(s.substring(0, (int) numOfLastChars), 'a');
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException
    {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final String s = scanner.nextLine();

        final long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
