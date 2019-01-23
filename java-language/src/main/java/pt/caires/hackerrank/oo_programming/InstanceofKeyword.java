package pt.caires.hackerrank.oo_programming;

import java.util.ArrayList;
import java.util.Scanner;


class Student
{
}

class Rockstar
{
}

class Hacker
{
}

/**
 *
 */
public class InstanceofKeyword
{
    private static String count(final ArrayList mylist)
    {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++)
        {
            final Object element = mylist.get(i);
            if (element instanceof Student)
            {
                a++;
            }
            if (element instanceof Rockstar)
            {
                b++;
            }
            if (element instanceof Hacker)
            {
                c++;
            }
        }
        return a + " " + b + " " + c;
    }

    public static void main(final String[] args)
    {
        final ArrayList mylist = new ArrayList();
        final Scanner sc = new Scanner(System.in);
        final int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            final String s = sc.next();
            if (s.equals("Student"))
            {
                mylist.add(new Student());
            }
            if (s.equals("Rockstar"))
            {
                mylist.add(new Rockstar());
            }
            if (s.equals("Hacker"))
            {
                mylist.add(new Hacker());
            }
        }
        System.out.println(count(mylist));
    }
}
