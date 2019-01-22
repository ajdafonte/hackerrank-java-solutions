package pt.caires.hackerrank;

import java.util.Scanner;


/**
 * Created by aleja on 23/01/2019.
 */
public class Solution1
{
    public static void main(final String[] args)
    {
        final int i = 4;
        final double d = 4.0;
        final String s = "HackerRank ";

        final Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        final int x;
        final double y;
        final String z;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        x = scan.nextInt();
        y = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(Math.addExact(i, x));

        /* Print the sum of the double variables on a new line. */
        final double total = d + y;
        System.out.println(total);

        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */
        System.out.println(s + z);

        scan.close();
    }
}
