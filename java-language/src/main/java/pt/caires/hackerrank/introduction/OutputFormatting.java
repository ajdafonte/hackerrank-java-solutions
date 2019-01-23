package pt.caires.hackerrank.introduction;

import java.util.Scanner;


/**
 *
 */
public class OutputFormatting
{
    public static void main(final String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++)
        {
            final String s1 = sc.next();
            final int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

    }
}
