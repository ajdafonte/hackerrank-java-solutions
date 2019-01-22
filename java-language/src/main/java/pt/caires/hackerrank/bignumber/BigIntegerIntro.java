package pt.caires.hackerrank.bignumber;

import java.math.BigInteger;
import java.util.Scanner;


/**
 * Created by aleja on 31/12/2018.
 */
public class BigIntegerIntro
{
    public static void main(final String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (final Scanner sc = new Scanner(System.in))
        {
            final BigInteger bi1 = sc.nextBigInteger();
            final BigInteger bi2 = sc.nextBigInteger();
            System.out.println(bi1.add(bi2));
            System.out.println(bi1.multiply(bi2));
        }
    }
}
