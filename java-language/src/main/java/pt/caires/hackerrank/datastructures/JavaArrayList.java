package pt.caires.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by aleja on 07/01/2019.
 */
public class JavaArrayList
{
    private static ArrayList<ArrayList<Integer>> list;

    private static void initializeList(final Scanner sc)
    {
        final int n = sc.nextInt();
        list = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            final int d = sc.nextInt();
            final ArrayList<Integer> line = new ArrayList<>(d);
            for (int j = 0; j < d; j++)
            {
                line.add(sc.nextInt());
            }
            list.add(line);
        }
    }

    private static void performQueriesInList(final Scanner sc)
    {
        final int q = sc.nextInt();
        for (int i = 0; i < q; i++)
        {
            final int x = sc.nextInt();
            final int y = sc.nextInt();
            performQueryInList(x - 1, y - 1);
        }
    }

    private static void performQueryInList(final int x, final int y)
    {
        try
        {
            System.out.println(list.get(x).get(y));
        }
        catch (final IndexOutOfBoundsException e)
        {
            System.out.println("ERROR!");
        }
    }

    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            initializeList(sc);
            performQueriesInList(sc);
        }
    }

}
