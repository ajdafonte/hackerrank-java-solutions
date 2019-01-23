package pt.caires.hackerrank.introduction;

import java.util.Scanner;


/**
 *
 */
public class EndOfFile
{
    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            int count = 1;
            while (sc.hasNext())
            {
                System.out.println(count++ + " " + sc.nextLine());
            }
        }
    }
}
