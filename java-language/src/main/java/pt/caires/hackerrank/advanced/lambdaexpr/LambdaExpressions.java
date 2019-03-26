package pt.caires.hackerrank.advanced.lambdaexpr;

import java.util.Scanner;
import java.util.function.Function;


/**
 * Remark: Another approach not submitted in HackerRank
 */
public class LambdaExpressions
{
    private static Function<Integer, Boolean> isOdd()
    {
        return num -> num % 2 != 0;
    }

    private static boolean checkPrime(final int num)
    {
        boolean result = true;
        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                result = false;
                break;
            }
        }
        return result;
    }

    private static Function<Integer, Boolean> isPrime()
    {
        return num -> num <= 3 || checkPrime(num);
    }

    private static Function<Integer, Boolean> isPalindrome()
    {
        return num -> {
            final String numStr = Integer.toString(num);
            return numStr.equals(new StringBuilder(numStr).reverse().toString());
        };
    }

    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            final int numTests = sc.nextInt();
            for (int i = 0; i < numTests; i++)
            {
                final int functionId = sc.nextInt();
                final int num = sc.nextInt();
                switch (functionId)
                {
                    case 1:
                    {
                        System.out.println("Check number " + num + " with function odd/even");
                        System.out.println("Result of fn:");
                        System.out.println((isOdd().apply(num) ? "ODD" : "EVEN"));
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Check number " + num + " with function prime");
                        System.out.println("Result of fn:");
                        System.out.println((isPrime().apply(num) ? "PRIME" : "COMPOSITE"));
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Check number " + num + " with function palindrome");
                        System.out.println("Result of fn:");
                        System.out.println((isPalindrome().apply(num) ? "PALINDROME" : "NOT PALINDROME"));
                        break;
                    }

                }
            }
        }
    }
}
