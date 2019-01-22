package pt.caires.hackerrank.strings;

import java.util.Scanner;


/**
 * Created by aleja on 28/12/2018.
 */
public class Reverse
{
    // TODO - should be improved
    private static boolean isPalindrome(final String s)
    {
        for (int i = 0; i < s.length() / 2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                return false;
            }
//        for (int i = 0; i < s.length() / 2; i++)
//        {
//            for (final int j = s.length() - 1 - i; j > s.length() / 2; j--)
//            {
//                System.out.println("i pos = " + i + " value " + s.charAt(i));
//                System.out.println("j pos = " + j + " value " + s.charAt(j));
//                if (s.charAt(i) != s.charAt(j))
//                {
//                    return false;
//                }
//                else
//                {
//                    break;
//                }
//            }
//        }
        }
        return true;
    }

    public static void main(final String[] args)
    {

        final Scanner sc = new Scanner(System.in);
        final String A = sc.next();
        System.out.println(isPalindrome(A) ? "Yes" : "No");
    }
}
