package pt.caires.hackerrank.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Varargs
{
    public void main(final String[] args)
    {
        try
        {
            final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            final int n1 = Integer.parseInt(br.readLine());
            final int n2 = Integer.parseInt(br.readLine());
            final int n3 = Integer.parseInt(br.readLine());
            final int n4 = Integer.parseInt(br.readLine());
            final int n5 = Integer.parseInt(br.readLine());
            final int n6 = Integer.parseInt(br.readLine());
            final Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
            final Method[] methods = Add.class.getDeclaredMethods();
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
            e.printStackTrace();
        }
    }

    class Add
    {
        void add(final Integer... nums)
        {
            final List<Integer> ints = Arrays.asList(nums);
            int result = 0;
            for (int i = 0; i < ints.size(); i++)
            {
                final int currNum = ints.get(i);
                result += currNum;
                if (i == ints.size() - 1)
                {
                    System.out.print(currNum + "=");
                    System.out.println(result);
                }
                else
                {
                    System.out.print(currNum + "+");
                }
            }
        }
    }
}