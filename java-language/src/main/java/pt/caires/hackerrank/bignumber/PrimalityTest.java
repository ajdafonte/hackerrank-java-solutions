package pt.caires.hackerrank.bignumber;

import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 */
public class PrimalityTest
{

//    Given a large integer, n, use the Java BigInteger class
//    ' isProbablePrime method to determine and print whether
//    it's prime or not prime.

    private static String isPrimeNumber(final BigInteger n)
    {
        return n.isProbablePrime(1) ? "prime" : "not prime";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args)
    {
        final String n = scanner.nextLine();
        System.out.println(isPrimeNumber(new BigInteger(n)));
        scanner.close();
    }
}
