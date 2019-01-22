package pt.caires.hackerrank.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class BigDecimalIntro
{

//    Given an array, s, of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format
//    as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ),
//    then they must be listed in the same order as they were received as input).
//
//    Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.
//
//    Input Format
//
//    The first line consists of a single integer, , denoting the number of integer strings.
//    Each line  of the  subsequent lines contains a real number denoting the value of .
//
//    Constraints
//
//    Each  has at most  digits.
//    Output Format
//
//    Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements.

//    Sample Input

//    9

//    -100
//    50
//    0
//    56.6
//    90
//    0.12
//    .12
//    02.34
//    000.000

//    Sample Output
//
//    90
//    56.6
//    50
//    02.34
//    0.12
//    .12
//    0
//    000.000
//    -100

    private static String[] orderedRealNumberStrings(final String[] numStrs)
    {
        final BigDecimal[] decimals = Arrays.stream(numStrs)
            .filter(x -> x != null)
            .map(BigDecimal::new)
            .sorted(Comparator.reverseOrder())
            .toArray(BigDecimal[]::new);
        Arrays.stream(decimals).forEach(System.out::println);

        return Arrays.stream(decimals)
            .map(BigDecimal::toPlainString)
            .toArray(String[]::new);
    }

    public static void main(final String[] args)
    {
        //Input
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++)
        {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        // Tasks:
        // - sort array in descending order (If two numbers represent numerically equivalent values (e.g., .1 and 0.1), then they must be listed in the same order as they were received as input).
        // - Each number must be printed in the exact same format as it was read from stdin
//        s = orderedRealNumberStrings(s);
        s = Arrays.stream(s)
            .filter(x -> x != null)
            .sorted((o1, o2) -> {
                BigDecimal decimal1 = new BigDecimal(o1);
                BigDecimal decimal2 = new BigDecimal(o2);
                return decimal2.compareTo(decimal1);
            })
            .toArray(String[]::new);

        //Output
        for (int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}
