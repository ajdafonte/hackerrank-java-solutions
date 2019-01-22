package pt.caires.hackerrank.datastructures;

import java.lang.reflect.Method;


class Printer
{
    protected <T> void printArray(final T[] obj)
    {
        for (int i = 0; i < obj.length; i++)
        {
            System.out.println(obj[i]);
        }
    }

}

public class JavaGenerics
{

    public static void main(final String[] args)
    {
        final Printer myPrinter = new Printer();
        final Integer[] intArray = {1, 2, 3};
        final String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (final Method method : Printer.class.getDeclaredMethods())
        {
            final String name = method.getName();

            if (name.equals("printArray"))
            {
                count++;
            }
        }

        if (count > 1)
        {
            System.out.println("Method overloading is not allowed!");
        }

    }
}