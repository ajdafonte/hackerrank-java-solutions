package pt.caires.hackerrank.oo_programming;

import java.util.Scanner;
import java.util.stream.IntStream;


interface AdvancedArithmetic
{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{

    @Override
    public int divisor_sum(final int n)
    {
        return IntStream.rangeClosed(1, n)
            .filter(num -> n % num == 0)
            .sum();
    }
}

public class JavaInterface
{
    public static void main(final String[] args)
    {
        final MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    private static void ImplementedInterfaceNames(final Object o)
    {
        final Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            final String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }

}
