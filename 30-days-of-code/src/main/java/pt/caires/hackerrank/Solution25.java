package pt.caires.hackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;


/**
 *
 */
public class Solution25
{
    private static boolean checkPrime(final int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(final String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner sc = new Scanner(System.in);
        final int numCases = sc.nextInt();
        IntStream.range(0, numCases).forEach(num -> {
            final int n = sc.nextInt();
            String result = "Not prime";
            if (n >= 2 && checkPrime(n))
            {
                result = "Prime";
            }
            System.out.println(result);
        });
        sc.close();
    }
}
