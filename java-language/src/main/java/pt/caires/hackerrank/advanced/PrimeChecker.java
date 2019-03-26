package pt.caires.hackerrank.advanced;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class Prime
{
    boolean isPrime(final int num)
    {
        if (num < 2)
        {
            return false;
        }

        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    void checkPrime(final Integer... nums)
    {
        Arrays.stream(nums)
            .filter(this::isPrime)
            .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}

/**
 *
 */
public class PrimeChecker
{
    public static void main(final String[] args)
    {
        try
        {
            final BufferedReader br = new BufferedReader(new InputStreamReader(in));
            final int n1 = Integer.parseInt(br.readLine());
            final int n2 = Integer.parseInt(br.readLine());
            final int n3 = Integer.parseInt(br.readLine());
            final int n4 = Integer.parseInt(br.readLine());
            final int n5 = Integer.parseInt(br.readLine());
            final Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            final Method[] methods = Prime.class.getDeclaredMethods();
            final Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++)
            {
                if (set.contains(methods[i].getName()))
                {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch (final Exception e)
        {
            System.out.println(e);
        }
    }
}
