package pt.caires.hackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;


interface AdvancedArithmetic
{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic
{
    @Override
    public int divisorSum(final int n)
    {
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).sum();
    }
}

/**
 *
 */
class Solution19
{
    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        scan.close();

        final AdvancedArithmetic myCalculator = new Calculator();
        final int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}