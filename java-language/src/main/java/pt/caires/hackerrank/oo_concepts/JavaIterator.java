package pt.caires.hackerrank.oo_concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * Created by aleja on 18/01/2019.
 */
public class JavaIterator
{
    static Iterator func(final ArrayList mylist)
    {
        final Iterator it = mylist.iterator();
        while (it.hasNext())
        {
            final Object element = it.next();
            if (element instanceof String) //Hints: use instanceof operator
            {
//                it.f
                break;
            }
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(final String[] args)
    {
        final ArrayList mylist = new ArrayList();
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++)
        {
            mylist.add(sc.next());
        }

        final Iterator it = func(mylist);
        while (it.hasNext())
        {
            final Object element = it.next();
            System.out.println((String) element);
        }
    }
}
