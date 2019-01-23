package pt.caires.hackerrank.introduction;

import java.util.Scanner;


/**
 *
 */
public class StaticInitializerBlock
{
    private static short B = 0;
    private static short H = 0;
    private static boolean flag = false;

    private static boolean checkShortValues(final short valB, final short valH)
    {
        return valB > 0 && valH > 0;
    }

    static
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            final short valB = sc.nextShort();
            final short valH = sc.nextShort();
            flag = checkShortValues(valB, valH);
            if (flag)
            {
                B = valB;
                H = valH;
            }
            else
            {
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch (final Exception e)
        {
            System.out.println(e);
        }

    }

    public static void main(final String[] args)
    {
        if (flag)
        {
            final int area = B * H;
            System.out.print(area);
        }

    }//end of main
}
