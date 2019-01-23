package pt.caires.hackerrank.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 */
public class JavaMap
{
    private static final Map<String, Integer> phoneBook = new HashMap<>();

    public static void main(final String[] argh)
    {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++)
        {
            final String name = in.nextLine();
            final int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext())
        {
            final String s = in.nextLine();
            if (phoneBook.containsKey(s))
            {
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}
