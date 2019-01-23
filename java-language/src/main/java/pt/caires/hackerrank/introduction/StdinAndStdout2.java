package pt.caires.hackerrank.introduction;

import java.util.Scanner;


/**
 *
 */
public class StdinAndStdout2
{
    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);
        final int i = scan.nextInt();
        final double d = scan.nextDouble();
        scan.nextLine();
        final String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
